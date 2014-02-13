package math.utilite;

import java.util.regex.*;
/**
 * Created by dbaskal on 2/13/14.
 */
public class CheckingTheInput {

    public static boolean isDigital(String s) {
        Pattern p = Pattern.compile("^\\d+$");
        Matcher matcher = p.matcher(s);
        return matcher.matches();
    }

    public static boolean isEMail(String s) {
        Pattern p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = p.matcher(s);
        return matcher.matches();
    }

    public static boolean isUsername(String s) {
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher matcher = p.matcher(s);
        return matcher.matches();
    }

    public static void main(String [] args){
        System.out.println(isUsername("2387"));

    }
}