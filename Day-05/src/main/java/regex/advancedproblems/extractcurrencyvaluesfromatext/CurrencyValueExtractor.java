package regex.advancedproblems.extractcurrencyvaluesfromatext;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
public class CurrencyValueExtractor {
    private static final String CURRENCY_PATTERN = "\\$?\\d+(?:\\.\\d{1,2})?";
    public static List<String> extractCurrencyValues(String text) {
        List<String> values = new ArrayList<>();
        Pattern pattern = Pattern.compile(CURRENCY_PATTERN);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        System.out.println(extractCurrencyValues(text));
    }
}