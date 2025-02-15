package regex.advancedproblems.validateasocialsecuritynumber;


import java.util.regex.Pattern;
public class SSNValidator {

    private static final String SSN_PATTERN = "^\\d{3}-\\d{2}-\\d{4}$";

    public static boolean isValidSSN(String ssn) {
        return Pattern.matches(SSN_PATTERN, ssn);
    }

    public static void main(String[] args) {
        String ssn = "123-45-6789";
        System.out.println(isValidSSN(ssn) ? "Valid" : "Invalid");
    }
}