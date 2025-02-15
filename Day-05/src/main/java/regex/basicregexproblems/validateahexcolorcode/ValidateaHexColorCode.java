package regex.basicregexproblems.validateahexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateaHexColorCode {
    public static void main(String[] args) {
        String regex = "#[a-zA-Z0-9]{6}$";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =validateahexcod(regex,input);
        while(matcher.find()) {
                System.out.println("Matched"+" : " +matcher.group());

            }

    }

    private static Matcher validateahexcod(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(input);
        return  matcher1;
    }


}
