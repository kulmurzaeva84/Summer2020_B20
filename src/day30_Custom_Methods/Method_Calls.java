package day30_Custom_Methods;
import Library.Util;
public class Method_Calls {




    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;

    }

}
