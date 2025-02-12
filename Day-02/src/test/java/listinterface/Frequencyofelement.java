package listinterface;

import listinterface.frequencyofelements.FrequencyOfElements;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Frequencyofelement {
    List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
    @Test
    public void q1()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("banana",1);
        map.put("orange",1);
        map.put("apple",2);
        Map<String,Integer> map1 =  FrequencyOfElements.frequencyOfString(list);

        assertEquals(map1,map);

    }

}
