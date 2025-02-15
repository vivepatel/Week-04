package regex.advancedproblems.findrepeatingwordsinasentence;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Set;
public class RepeatingWordFinder {

    private static final String REPEATING_WORD_PATTERN = "\\b(\\w+)\\b(?=.*?\\b\\1\\b)";

    public static Set<String> findRepeatingWords(String sentence) {
        Set<String> repeatingWords = new HashSet<>();
        Pattern pattern = Pattern.compile(REPEATING_WORD_PATTERN);
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        return repeatingWords;
    }

    public static void main(String[] args) {
        String sentence = "This is is a repeated repeated word test.";
        System.out.println(findRepeatingWords(sentence));
    }
}