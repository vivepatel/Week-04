package regex.replaceandmodifystrings.censorbadwordsinsentence;

import java.util.Set;
import java.util.HashSet;

public class CensorBadWords {
    public static String censorSentence(String sentence, Set<String> badWords) {
        for (String badWord : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return sentence;
    }

    public static void main(String[] args) {
        String sentence = "This is a damn bad example with some stupid words.";
        Set<String> badWords = new HashSet<>();
        badWords.add("damn");
        badWords.add("stupid");

        String result = censorSentence(sentence, badWords);
        System.out.println(result);
    }
}
