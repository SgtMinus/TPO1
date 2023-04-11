package task2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task2.ChainMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsKeyTest {

    private ChainMap map;

    @BeforeEach
    public void setup() {
        map = new ChainMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
    }

    @Test
    void testContainsKeyForExistingKey() {
        assertTrue(map.containsKey(2));
    }

    @Test
    void testContainsKeyForNonExistingKey() {
        assertFalse(map.containsKey(4));
    }
}
