package regex.extractionproblems.webpage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Webpage {
    public static void main(String[] args) {
        String regex = "https?://\\S+|www\\.\\S+\n";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =extractproblemwebpage(regex,input);
        while (matcher.find())
        {
            System.out.print(matcher.group()+", ");
        }
    }

    private static Matcher extractproblemwebpage(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1= pattern.matcher(input);
        return matcher1;
    }
}
