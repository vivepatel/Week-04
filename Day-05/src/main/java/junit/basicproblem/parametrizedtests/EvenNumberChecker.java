package junit.basicproblem.parametrizedtests;



public class EvenNumberChecker {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        EvenNumberChecker checker = new EvenNumberChecker();
        System.out.println("Is 2 even? " + checker.isEven(2));
        System.out.println("Is 7 even? " + checker.isEven(7));
    }
}