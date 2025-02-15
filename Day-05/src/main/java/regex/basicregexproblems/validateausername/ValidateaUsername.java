package regex.basicregexproblems.validateausername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateaUsername {
    public static Matcher checkUsername(String regex, String input)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        return matcher;
    }
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9_.+-]+$";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher1=checkUsername(regex,input);
        while (matcher1.find())
        {
            System.out.println("Matched" + " :"+matcher1.group() );
        }


    }



}
