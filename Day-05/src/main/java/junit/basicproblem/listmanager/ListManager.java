package junit.basicproblem.listmanager;

import java.util.List;
public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        List<Integer> list = new java.util.ArrayList<>();

        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        listManager.removeElement(list, 10);

        System.out.println("List Size: " + listManager.getSize(list));
    }
}