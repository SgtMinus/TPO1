package task3tests;

import org.junit.jupiter.api.Test;
import task3.Creature;

import static org.junit.jupiter.api.Assertions.*;

public class CreatureTest {
    @Test
    public void testConstructorWithThreeArgs() {
        Creature creature = new Creature("Gandalf", 1000, "Wizard");
        assertEquals("Gandalf", creature.getName());
        assertEquals(1000, creature.getAge());
        assertEquals("Apache", creature.getGender());
        assertEquals("Wizard", creature.getSpecies());
    }

    @Test
    public void testConstructorWithFourArgs() {
        Creature creature = new Creature("Harry Potter", 17, "Male", "Wizard");
        assertEquals("Harry Potter", creature.getName());
        assertEquals(17, creature.getAge());
        assertEquals("Male", creature.getGender());
        assertEquals("Wizard", creature.getSpecies());
    }

    @Test
    public void testDoHeroicDeeds() {
        Creature creature = new Creature("Frodo Baggins", 33, "Hobbit");
        String expected = "Frodo Baggins is doing something heroic: destroy the One Ring";
        assertEquals(expected, creature.doHeroicDeeds("destroy the One Ring"));
    }


}