import static org.junit.jupiter.api.Assertions.*;

import filestreams.UserInputFromConsole;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;

class UserInputFromConsoleTest {
    private static final String TEST_FILE = "output.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.createFile(Paths.get(TEST_FILE));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testGetUserInput() throws IOException {
        String simulatedInput = "Abhishek\n22\nBhopal\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String userData = UserInputFromConsole.getUserInput();

        String expectedOutput = "Name: Abhishek\nAge: 22\nCity: Bhopal\nLanguage: Java";

        assertEquals(expectedOutput, userData);
    }

    @Test
    void testWriteToFile() throws IOException {
        String testData = "Name: TestUser\nAge: 30\nCity: Bhopal\nLanguage: Python\n\n";

        try (FileWriter writer = new FileWriter(TEST_FILE)) {
            writer.write(testData);
        }

        String fileContent = new String(Files.readAllBytes(Paths.get(TEST_FILE)));

        assertEquals(testData, fileContent);
    }
}