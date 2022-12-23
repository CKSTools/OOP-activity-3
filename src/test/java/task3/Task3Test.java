package task3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void testFileIsReadCorrectly() throws IOException {
        GreekGods gods = new GreekGods();
        gods.readFile();
        assertEquals(9, gods.getList().size());
        assertTrue(gods.getList().contains("Poseidon"));
        assertTrue(gods.getList().contains("Hades"));
        assertTrue(gods.getList().contains("Hermes"));
        assertTrue(gods.getList().contains("Zeus"));
        assertTrue(gods.getList().contains("Apollo"));
        assertTrue(gods.getList().contains("Ares"));
        assertTrue(gods.getList().contains("Aphrodite"));
        assertTrue(gods.getList().contains("Artemis"));
        assertTrue(gods.getList().contains("Athena")); 
    }

    @Test
    public void testFileIsFilteredCorrectly() throws IOException {
        GreekGods gods = new GreekGods();
        gods.readFile();
        gods.saveFilteredGods();
        List<String> filtered = Files.readAllLines(Path.of("filtered-gods.txt"));
        assertEquals(4, filtered.size());
        assertTrue(filtered.contains("Poseidon"));
        assertTrue(filtered.contains("Hades"));
        assertTrue(filtered.contains("Hermes"));
        assertTrue(filtered.contains("Zeus"));

        assertFalse(filtered.contains("Apollo"));
        assertFalse(filtered.contains("Ares"));
        assertFalse(filtered.contains("Aphrodite"));
        assertFalse(filtered.contains("Artemis"));
        assertFalse(filtered.contains("Athena"));
    }
}
