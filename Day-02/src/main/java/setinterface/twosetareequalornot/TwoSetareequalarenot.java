package setinterface.twosetareequalornot;

import java.util.HashSet;
import java.util.Set;

public class TwoSetareequalarenot {
    public static Set<Integer> equalornot(Set<Integer> set1, Set<Integer>set2)
    {
        if(set1.containsAll(set2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        return set1;
    }

    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        TwoSetareequalarenot.equalornot(set1,set2);

    }
}
