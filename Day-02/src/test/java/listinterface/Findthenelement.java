package listinterface;


import org.junit.Test;
import listinterface.findingthenthelement.*;
import java.util.Arrays;
import java.util.LinkedList;
import listinterface.findingthenthelement.*;

import static org.junit.Assert.assertEquals;

public class Findthenelement {



    LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));

    @Test
    public void q1()
    {
      String list1 = FindNthFromEndCollection.findNthFromEnd(list,2);
      String extected ="D";
      assertEquals(list1,extected);
    }

}
