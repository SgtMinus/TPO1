package task3tests;

import org.junit.jupiter.api.Test;
import task3.Star;

import static org.junit.jupiter.api.Assertions.*;

public class StarTest {

    @Test
    void testExplode() {
        double[] coordinates = {1.0, 2.0, 3.0};
        Star star = new Star("Sun", 6967, 5678, coordinates);
        star.explode();
        assertEquals(Double.POSITIVE_INFINITY, star.getTemperature());
        assertEquals(0, star.getRadius());
    }
}