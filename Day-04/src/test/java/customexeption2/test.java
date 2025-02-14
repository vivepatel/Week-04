package customexeption2;
import customexeption.*;
import org.junit.Test;

public class test {
    String error= "Access granted!";
    @Test
    public void q1()
    {
        int age=18;
        String error1=AgeValidator.validateAge(age);

    }
}
