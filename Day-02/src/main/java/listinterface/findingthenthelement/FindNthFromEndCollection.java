package listinterface.findingthenthelement;

import java.util.LinkedList;

 public  class FindNthFromEndCollection {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        // Use two-pointer technique
        var first = list.listIterator();
        var second = list.listIterator();

        // Move the first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return "N is larger than the list size";
            first.next();
        }

        // Move both pointers one step at a time
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println("Nth element from the end: " + findNthFromEnd(list,N));
}
}