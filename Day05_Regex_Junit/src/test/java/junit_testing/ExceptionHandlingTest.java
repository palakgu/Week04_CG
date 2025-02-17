package junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import junit.ExceptionHandling;
import org.junit.jupiter.api.Test;

class ExceptionHandlingTest {

    @Test
    void testDivideValid() {
        assertEquals(5, ExceptionHandling.divide(10, 2));
        assertEquals(-3, ExceptionHandling.divide(-9, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandling.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
