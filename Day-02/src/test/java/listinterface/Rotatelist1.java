package listinterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import listinterface.rotatelist.*;

import static org.junit.Assert.assertEquals;


public class Rotatelist1 {
    List<Integer> list= new ArrayList<>(Arrays.asList(10,20,30,40,50));
    @Test
    public void q1()
    {
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(30,40,50,10,20));
        RotateList.rotatelist(list);
        assertEquals(expectedList,list);

    }


}
