package reflection.advancedproblem.dependencyinjection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DIContainerTest {

    @Test
    public void testDIContainer() throws IllegalAccessException, InstantiationException {
        DIContainer diContainer = new DIContainer();

        diContainer.registerBean(ServiceA.class);
        diContainer.registerBean(ServiceB.class);

        ServiceB serviceB = new ServiceB();
        diContainer.injectDependencies(serviceB);


        assertNotNull(serviceB);
        assertNotNull(serviceB.serviceA);
    }
}

