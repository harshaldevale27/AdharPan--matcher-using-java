package Project;
import java.util.*;
public class PanAdharMatcherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adharservice adharService = new Adharservice();
        Panservice pandervice=new Panservice();
        System.out.println("Ener the Adhar Number:");
        String adharNumber=sc.nextLine();
        Adhar adhar = adharService.getAdharByNumber(adharNumber);
        Pan pan=pandervice.getPanByadharNumber(adharNumber);
        if(adhar!=null&&pan!=null)
        {
            System.out.println("Adhar Detail"+adhar);
            System.out.println("Pan Detail"+pan);
        }
        else{
            System.out.println("No Match Found......");
        }
    }
}
