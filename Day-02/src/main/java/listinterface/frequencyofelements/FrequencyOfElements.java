package listinterface.frequencyofelements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static Map<String,Integer> frequencyOfString(List<String> list)
    {
        Map<String,Integer> frequencey = new HashMap<>();
        for(String elements : list)
        {
            frequencey.put(elements, frequencey.getOrDefault(elements, 0) + 1);
        }
        return frequencey;
    }
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");
        FrequencyOfElements.frequencyOfString(inputList);
        System.out.println(FrequencyOfElements.frequencyOfString(inputList));

    }
}
