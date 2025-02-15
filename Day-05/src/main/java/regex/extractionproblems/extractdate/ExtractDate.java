package regex.extractionproblems.extractdate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void main(String[] args) {
        String regex = "[0-9]{2}+/[0-9]+/[0-9]{4}";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =extractproblemdate(regex,input);
        while (matcher.find())
        {
            System.out.print(matcher.group()+", ");
        }
    }

    private static Matcher extractproblemdate(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(input);
        return matcher1;

    }
}
