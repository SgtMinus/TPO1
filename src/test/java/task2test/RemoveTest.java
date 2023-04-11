package task2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task2.ChainMap;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveTest {
    private ChainMap map;

    @BeforeEach
    void setUp() {
        map = new ChainMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
    }

    @Test
    void testRemoveExistingPair() {
        assertTrue(map.containsKey(2));
        map.remove(2);
        assertFalse(map.containsKey(2));
    }

    @Test
    void testRemoveNonExistingPair() {
        assertFalse(map.containsKey(4));
        map.remove(4);
        assertFalse(map.containsKey(4));
    }

}
