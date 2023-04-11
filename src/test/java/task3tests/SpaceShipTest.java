package task3tests;

import org.junit.jupiter.api.Test;
import task3.SpaceShip;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceShipTest {
    @Test
    public void testConstructorWithTwoArgs() {
        SpaceShip spaceShip = new SpaceShip("Enterprise", 500.0);
        assertEquals("Enterprise", spaceShip.getName());
        assertEquals(500.0, spaceShip.getMaxSpeed(), 0.0);
        assertEquals(0.0, spaceShip.getCurrentSpeed(), 0.0);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, spaceShip.getCoordinates(), 0.0);
    }

    @Test
    public void testConstructorWithThreeArgs() {
        double[] initialCoords = new double[]{1.0, 2.0, 3.0};
        SpaceShip spaceShip = new SpaceShip("Falcon", 300.0, initialCoords);
        assertEquals("Falcon", spaceShip.getName());
        assertEquals(300.0, spaceShip.getMaxSpeed(), 0.0);
        assertEquals(0.0, spaceShip.getCurrentSpeed(), 0.0);
        assertArrayEquals(initialCoords, spaceShip.getCoordinates(), 0.0);
    }

    @Test
    public void testAccelerateWithinMaxSpeed() {
        SpaceShip spaceShip = new SpaceShip("Voyager", 200.0);
        spaceShip.accelerate(100.0);
        assertEquals(100.0, spaceShip.getCurrentSpeed(), 0.0);
        spaceShip.accelerate(50.0);
        assertEquals(150.0, spaceShip.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testAccelerateBeyondMaxSpeed() {
        SpaceShip spaceShip = new SpaceShip("Millennium Falcon", 150.0);
        spaceShip.accelerate(200.0);
        assertEquals(150.0, spaceShip.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testDecelerateToStop() {
        SpaceShip spaceShip = new SpaceShip("Galactica", 300.0);
        spaceShip.accelerate(250.0);
        spaceShip.decelerate(250.0);
        assertEquals(0.0, spaceShip.getCurrentSpeed(), 0.0);
    }
    @Test
    public void testDecelerateBelowZero() {
        SpaceShip spaceShip = new SpaceShip("Death Star", 100.0);
        spaceShip.accelerate(50.0);
        spaceShip.decelerate(100.0);
        assertEquals(0.0, spaceShip.getCurrentSpeed(), 0.0);
    }

    @Test
    public void testMoveToNewCoordinates() {
        double[] initialCoords = new double[]{1.0, 2.0, 3.0};
        SpaceShip spaceShip = new SpaceShip("USS Discovery", 400.0, initialCoords);
        double[] newCoords = new double[]{4.0, 5.0, 6.0};
        spaceShip.move(newCoords);
        assertArrayEquals(newCoords, spaceShip.getCoordinates(), 0.0);
    }
}