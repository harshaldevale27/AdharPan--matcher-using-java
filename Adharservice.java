package Project;

import java.util.HashMap;
import java.util.Map;

public class Adharservice {
    private static Map<String,Adhar> adharMap=new HashMap<>();
    static{
        adharMap.put("1234567890",new Adhar("dhanodi","1234567890","vijay","Harshal"));
        adharMap.put("1234567891",new Adhar("dhanodi","1234567891","vijay","Nandini"));
        adharMap.put("1234567892",new Adhar("murtijapur","1234567892","gopal","Devesh"));
    }
    public Adhar getAdharByNumber(String adharNumber)
    {
        return adharMap.get(adharNumber);
    }
}
