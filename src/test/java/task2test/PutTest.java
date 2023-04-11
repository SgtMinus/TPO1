package task2test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import task2.ChainMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PutTest {
    private ChainMap map;

    @BeforeEach
    public void setup() {
        map = new ChainMap();
    }

    @Test
    public void testPutSingleKeyValuePair() {
        map.put(1, 10);
        Integer expected = 10;
        Integer actual = map.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testPutMultipleKeyValuePairs() {
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        Integer expected1 = 10;
        Integer expected2 = 20;
        Integer expected3 = 30;
        Integer actual1 = map.get(1);
        Integer actual2 = map.get(2);
        Integer actual3 = map.get(3);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testPutDuplicateKey() {
        map.put(1, 10);
        map.put(1, 20);
        Integer expected = 20;
        Integer actual = map.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testPutLargeNumberOfKeyValuePairs() {
        ChainMap map = new ChainMap();
        for (int i = 0; i < 10000; i++) {
            map.put(i, i*10);
        }
        for (int i = 0; i < 10000; i++) {
            Integer expected = i*10;
            Integer actual = map.get(i);
            assertEquals(expected, actual);
        }
    }




}
