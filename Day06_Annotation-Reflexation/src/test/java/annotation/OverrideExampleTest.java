package annotation;

import annotation.useoverride.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OverrideExampleTest {
    @Test
    public void testMakeSound(){
        Dog dog = new Dog();
        Assertions.assertTrue( dog.makeSound().contains("Dogs Bark"));
    }
}
