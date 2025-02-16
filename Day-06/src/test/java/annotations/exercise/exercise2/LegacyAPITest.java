package annotations.exercise.exercise2;

import org.junit.jupiter.api.Test;
public class LegacyAPITest {

    @Test
    public void testOldFeatureDeprecated() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.oldFeature();
    }

    @Test
    public void testNewFeature() {
        LegacyAPI legacyAPI = new LegacyAPI();
        legacyAPI.newFeature();
    }
}
