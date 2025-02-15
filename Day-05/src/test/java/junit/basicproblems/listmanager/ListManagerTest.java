package junit.basicproblems.listmanager;



import static org.junit.jupiter.api.Assertions.*;

import junit.basicproblem.listmanager.ListManager;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class ListManagerTest {

    ListManager listManager = new ListManager();

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        assertEquals(2, listManager.getSize(list));
    }
}