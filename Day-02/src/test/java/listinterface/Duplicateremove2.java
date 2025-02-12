package listinterface;

import org.junit.Test;
import listinterface.duplicateremove.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Duplicateremove2 {
    List<Integer> list = new ArrayList<>(Arrays.asList(3,1,4,1,2,3));
    @Test
    public void q1()
    {
        List<Integer> expected = new ArrayList<>(Arrays.asList(3,1,4,2));
        List<Integer> list2 =DuplicateRemove.removeduplicate(list);

        assertEquals(list2,expected);
    }


}
