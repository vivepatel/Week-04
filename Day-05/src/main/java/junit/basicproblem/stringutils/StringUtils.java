package junit.basicproblem.stringutils;



public class StringUtils {

    public String reverse(String str) {
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }

    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        System.out.println("Reverse: " + stringUtils.reverse("hello"));
        System.out.println("Is Palindrome: " + stringUtils.isPalindrome("madam"));
        System.out.println("To Upper Case: " + stringUtils.toUpperCase("hello"));
    }
}