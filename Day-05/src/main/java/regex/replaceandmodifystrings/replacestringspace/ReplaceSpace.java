package regex.replaceandmodifystrings.replacestringspace;

import java.util.Scanner;

public class ReplaceSpace {
    public static String replaceSpace(String input)
    {
        String replacespace  = input.replaceAll("\\s+", " ");
        return replacespace;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a String ");
        String input = sc.nextLine();

        System.out.println(ReplaceSpace.replaceSpace(input));
    }
}
