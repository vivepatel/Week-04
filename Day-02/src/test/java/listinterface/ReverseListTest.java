package listinterface;

import org.junit.Test;
import listinterface.reverselist.*;
//import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReverseListTest {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    LinkedList<Integer> list1= new LinkedList<>(Arrays.asList(1,2,3,4,5));
    @Test
    public void q1()
    {
        ArrayList<Integer> expectedlist = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        ArraylistReverse.reverselist1(list);
        //System.out.println(list);
        assertEquals(expectedlist,list);
    }
    @Test
    public void q2()
    {
        LinkedList<Integer> expectedlist1 = new LinkedList<>(Arrays.asList(5,4,3,2,1));
        Linkedlistreverse.reverselist2(list1);
        assertEquals(expectedlist1,list1);

    }


}

