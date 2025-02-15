package junit.adancedproblem.passwordvalidator;


public class PasswordValidator {

    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;
        if (password.length() >= 8) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }
        }
        return hasUppercase && hasDigit;
    }

    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        System.out.println("Password validation result: " + validator.validate("Test1234"));
    }
}