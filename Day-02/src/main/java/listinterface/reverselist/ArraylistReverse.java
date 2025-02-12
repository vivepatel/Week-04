package listinterface.reverselist;

import java.util.ArrayList;


public class ArraylistReverse {
    public    static void reverselist1(ArrayList<Integer> list)
    {
        int left=0;
        int right = list.size()-1;
        while(left<right)
        {
            int temp= list.get(left);
            int temp1= list.get(right);
            list.set(right,temp);
            list.set(left,temp1);
            left++;
            right--;
        }
        System.out.println(" Reversed List " + list);
    }

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(" Original List " + list);
        ArraylistReverse.reverselist1(list);



    }
}
