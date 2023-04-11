package task3tests;

import org.junit.jupiter.api.Test;
import task3.Planet;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanetTest {

    @Test
    public void testCreatePopulation() {
        Planet planet = new Planet("Earth", 6371, "terrestrial", new ArrayList<Double>());
        planet.createPopulation(100);
        assertEquals(100, planet.getPopulation().size());
    }

    @Test
    public void testChangeType() {
        Planet planet = new Planet("Mars", 3389, "terrestrial", new ArrayList<Double>());
        planet.changeType("red");
        assertEquals("red", planet.getType());
    }

}