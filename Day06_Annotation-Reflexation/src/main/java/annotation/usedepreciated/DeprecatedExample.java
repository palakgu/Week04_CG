package annotation.usedepreciated;

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI legacyAPI = new LegacyAPI();
        System.out.println(legacyAPI.newFeature());
        System.out.println(legacyAPI.oldFeature());
    }
}
