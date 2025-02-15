package regex.advancedproblems.extractprogramminglanguage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguage {
    public static void main(String[] args) {
        String regex = "\\b(Java|Python|JavaScript)\\b";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println();
        List<String> matcher =extractprograminglanguage(regex,input);
        System.out.println(matcher);

    }

    private static List<String> extractprograminglanguage(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(input);
        List<String> list = new ArrayList<>();
        while (matcher1.find())
        {
           list.add(matcher1.group());
        }
        return list;
    }
}
