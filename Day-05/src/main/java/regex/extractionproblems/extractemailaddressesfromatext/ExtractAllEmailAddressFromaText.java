package regex.extractionproblems.extractemailaddressesfromatext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressFromaText {
    public static void main(String[] args) {
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{3,}";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =extractproblems(regex,input);
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }

    private static Matcher extractproblems(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1= pattern.matcher(input);
        return matcher1;
    }
}
