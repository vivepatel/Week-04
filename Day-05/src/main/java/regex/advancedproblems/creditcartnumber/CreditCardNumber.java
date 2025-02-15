package regex.advancedproblems.creditcartnumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardNumber {
    public static void main(String[] args) {
        String regex = "[4][0-9+]{3}\\s[0-9+]{4}\\s[0-9+]{4}\\s[0-9+]{4}|[5][0-9+]{3}\\s[0-9+]{4}\\s[0-9+]{4}\\s[0-9+]{4}";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =validatecreditcart(regex,input);
        while (matcher.find())
        {
            System.out.print("Matched :"+matcher.group()+", ");
        }
    }

    private static Matcher validatecreditcart(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
