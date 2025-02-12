package listinterface.rotatelist;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void rotatelist(List<Integer> list)
    {
        for (int i = 0; i < 2; i++) {
            // storing the first element in the list
            int temp = list.get(0);
            // traverse the list and move elements to left
            for (int j = 0; j < list.size()-1; j++) {
                list.set(j, list.get(j + 1));
            }
            list.set(list.size()-1, temp);
        }
        System.out.println( " Rotated List " + list);
    }

    public static void main(String[] args) {

        List<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(" List before Rotating " + list);
       RotateList.rotatelist(list);


    }
}
