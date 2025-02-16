package annotations.exercise.exercise3;
import java.util.ArrayList;

public class CreateAndPrintList {

    @SuppressWarnings("unchecked")
    public static void createAndPrintList() {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        String str = (String) list.get(0);
        int num = (int) list.get(1);

        System.out.println("String element: " + str);
        System.out.println("Integer element: " + num);
    }
}
