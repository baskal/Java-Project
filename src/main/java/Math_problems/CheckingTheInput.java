package Math_problems;

/**
 * Created by dbaskal on 2/13/14.
 */
public class CheckingTheInput {
    private String string;
}

    public boolean checkNumber(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }
