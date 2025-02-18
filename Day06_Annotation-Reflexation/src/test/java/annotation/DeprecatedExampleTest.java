package annotation;

import annotation.usedepreciated.LegacyAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeprecatedExampleTest {
    @Test
    public void testExample(){
        LegacyAPI legacyAPI = new LegacyAPI();
        Assertions.assertTrue(legacyAPI.newFeature().contains("This is the new and improved feature"));
        Assertions.assertTrue((legacyAPI.oldFeature().contains("Warning: This feature is deprecated and may be removed in future versions")));
    }
}
