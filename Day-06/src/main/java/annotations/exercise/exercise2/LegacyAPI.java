package annotations.exercise.exercise2;
public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature. Please do not use it.");
    }

    public void newFeature() {
        System.out.println("This is the new feature. Use this instead.");
    }
}

