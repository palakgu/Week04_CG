
import exceptions.Checked_Exception;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckedExceptionTest {
    private static final String TEST_FILE = "question of capgemini.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.write(Paths.get(TEST_FILE), "Test content\nSecond line".getBytes());
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testReadFileContents() throws IOException {
        String expected = "Test content\nSecond line";
        String actual = Checked_Exception.readFileContent(TEST_FILE);
        assertEquals(expected, actual);
    }

    @Test
    void testFileNotFound() {
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            Checked_Exception.readFileContent("non_existent.txt");
        });

        assertNotNull(exception);
    }
}
