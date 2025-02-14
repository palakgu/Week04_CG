import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UncheckedExceptionTest {

    @Test
    void testValidDivision() {
        assertEquals(5, UncheckedExceptions.divideNumbers(10, 2));
        assertEquals(-3, UncheckedExceptions.divideNumbers(-9, 3));
        assertEquals(0, UncheckedExceptions.divideNumbers(0, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            UncheckedExceptions.divideNumbers(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
