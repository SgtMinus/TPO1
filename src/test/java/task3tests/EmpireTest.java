package task3tests;

import org.junit.jupiter.api.Test;
import task3.Creature;
import task3.Empire;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import task3.SpaceShip;


public class EmpireTest {

    @Test
    public void testConquer() {
        Empire empire = new Empire("Roman Empire");
        String result = empire.conquer("Gaul");
        assertEquals("Roman Empire has conquered Gaul", result);
    }

    @Test
    public void testUnite() {
        Empire empire1 = new Empire("Roman Empire");
        Empire empire2 = new Empire("Byzantine Empire");
        Empire empire3 = new Empire("Holy Roman Empire");

        ArrayList<Empire> empires = new ArrayList<>();
        empires.add(empire2);
        empires.add(empire3);

        String result = empire1.unite(empires);

        assertEquals("Roman Empire has united with the following empires:\n" +
                "- Byzantine Empire\n" +
                "- Holy Roman Empire\n", result);
    }

    @Test
    public void testBuild() {
        Empire empire = new Empire("Roman Empire");
        String result = empire.build(2, 3);
        assertEquals("Roman Empire has built 2 new spaceships and created 3 new creatures", result);

        ArrayList<SpaceShip> spaceships = empire.getSpaceships();
        assertEquals(2, spaceships.size());

        ArrayList<Creature> creatures = empire.getCreatures();
        assertEquals(3, creatures.size());

        for (SpaceShip spaceship : spaceships) {
            assertTrue(spaceship.getName().startsWith("SpaceShip"));
            assertEquals(300000000, spaceship.getMaxSpeed());
        }

        for (Creature creature : creatures) {
            assertTrue(creature.getName().startsWith("Roman Empirean"));
            assertEquals("Human", creature.getSpecies());
        }
    }
}