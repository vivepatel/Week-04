package junit.basicproblems.parametrizedtests;


import static org.junit.jupiter.api.Assertions.*;

import junit.basicproblem.parametrizedtests.EvenNumberChecker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenNumberCheckerTest {

    EvenNumberChecker checker = new EvenNumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void testIsEvenTrue(int number) {
        assertTrue(checker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 9})
    public void testIsEvenFalse(int number) {
        assertFalse(checker.isEven(number));
    }
}