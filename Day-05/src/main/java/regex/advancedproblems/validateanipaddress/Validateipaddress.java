package regex.advancedproblems.validateanipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validateipaddress {
    public static void main(String[] args) {
        String regex = "(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =validateipadress(regex,input);
        while (matcher.find())
        {
            System.out.print("Matched :"+matcher.group()+", ");
        }
    }

    private static Matcher validateipadress(String regex, String input) {
        Pattern pattern =  Pattern.compile(regex);
        Matcher matcher1= pattern.matcher(input);
        return matcher1;
    }
}
