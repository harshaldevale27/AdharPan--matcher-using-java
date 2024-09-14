package Project;

import java.util.HashMap;
import java.util.Map;

public class Panservice {
    private static Map<String,Pan> panMap= new HashMap<>();
    static{
        panMap.put("ASDF123",new Pan("1234567890","SBI","Stock and real estate","ASDF123"));
        panMap.put("ASDF1234",new Pan("1234567891","BOM","GOLD,FD","ASDF1234"));
        panMap.put("ASDF1235",new Pan("1234567892","HDFC","Stock ","ASDF1235"));

    }
    public Pan getPanByadharNumber(String adharNumber)
    {
        for( Pan pan:panMap.values())
        {
            if(pan.getAdharnumber().equals(adharNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
