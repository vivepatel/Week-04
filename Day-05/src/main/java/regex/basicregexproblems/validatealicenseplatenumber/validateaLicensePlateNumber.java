package regex.basicregexproblems.validatealicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateaLicensePlateNumber {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Matcher matcher =validateLicensePlateNumber(regex,input);
       // AB1234
        while (true)
        {
            if(matcher.find()) {
                System.out.println("Matched" + " : " + matcher.group());
                break;
            }
            else
            {
                System.out.println("Not Matched");
                break;
            }
        }

    }

    public static Matcher validateLicensePlateNumber(String regex,String input)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher2 = pattern.matcher(input);
        return matcher2;
    }
}
