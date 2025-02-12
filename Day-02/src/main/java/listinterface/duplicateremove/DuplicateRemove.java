package listinterface.duplicateremove;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemove {
    public static List<Integer>  removeduplicate(List<Integer> list)
    {
        ArrayList<Integer> newlist = new ArrayList<>();



        HashSet<Integer> removeduplicate  = new HashSet<>();
        for(int elements:list)
        {
            if(!removeduplicate.contains(elements))
            {
                removeduplicate.add(elements);
                newlist.add(elements);
            }
        }
        return newlist;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List before Removing Duplicate :" + list);
        System.out.println("List after Removing Duplicate  :" +DuplicateRemove.removeduplicate(list));


    }
}
