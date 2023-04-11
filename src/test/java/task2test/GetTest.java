package task2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task2.ChainMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetTest {
    private ChainMap map;

    @BeforeEach
    public void setup() {
        map = new ChainMap();
    }

    @Test
    public void testGetExistingKey() {
        map.put(1, 10);
        Integer result = map.get(1);
        assertEquals(10, result);
    }

    @Test
    public void testGetNonExistingKey() {
        Integer result = map.get(2);
        assertNull(result);
    }
}
