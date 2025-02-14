import static org.junit.jupiter.api.Assertions.*;

import count_words.CountWords;
//import count_words.CountWords.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

class CountWordsTesting {
    private static final String TEST_FILE = "src/test/java/TestFile";

    @BeforeEach
    void setup() throws IOException {
        List<String> lines = Arrays.asList(
                "hello world hello",
                "java is great, java is powerful",
                "hello java world"
        );
        Files.write(Paths.get(TEST_FILE), lines);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testCountWords() throws IOException {
        Map<String, Integer> wordCountMap = CountWords.countWords(TEST_FILE);

        assertEquals(3, wordCountMap.get("hello"));
        assertEquals(2, wordCountMap.get("world"));
        assertEquals(3, wordCountMap.get("java"));
        assertEquals(2, wordCountMap.get("is"));
        assertEquals(1, wordCountMap.get("great"));
        assertEquals(1, wordCountMap.get("powerful"));
    }


}