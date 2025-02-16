package reflection.advancedproblem.dependencyinjection;
public class ServiceB {
    @Inject
    ServiceA serviceA;

    public void performAction() {
        System.out.println("ServiceB is performing an action");
        serviceA.performAction();
    }
}


