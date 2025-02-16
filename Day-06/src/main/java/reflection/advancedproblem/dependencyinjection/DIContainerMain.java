package reflection.advancedproblem.dependencyinjection;

public class DIContainerMain {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        DIContainer diContainer = new DIContainer();

        diContainer.registerBean(ServiceA.class);
        diContainer.registerBean(ServiceB.class);

        ServiceB serviceB = new ServiceB();

        diContainer.injectDependencies(serviceB);
        serviceB.performAction();
    }
}
