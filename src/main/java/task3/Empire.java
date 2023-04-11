package task3;

import java.util.ArrayList;

public class Empire {
    private String name;
    private ArrayList<SpaceShip> spaceships;
    private ArrayList<Creature> creatures;

    public Empire(String name) {
        this.name = name;
        this.spaceships = new ArrayList<SpaceShip>();
        this.creatures = new ArrayList<Creature>();
    }

    public String conquer(String territory) {
        return name + " has conquered " + territory;
    }

    public String unite(ArrayList<Empire> empires) {
        StringBuilder logs = new StringBuilder(name + " has united with the following empires:\n");
        for (Empire empire : empires) {
            logs.append("- ").append(empire.getName()).append("\n");
        }
        return logs.toString();
    }

    public String build(int numSpaceships, int numCreatures) {
        for (int i = 0; i < numSpaceships; i++) {
            SpaceShip spaceship = new SpaceShip("SpaceShip " + (i+1), 300000000);
            spaceships.add(spaceship);
        }
        for (int i = 0; i < numCreatures; i++) {
            Creature creature = new Creature( name +"an " + (i+1), 0, "Human");
            creatures.add(creature);
        }
        return name + " has built " + numSpaceships + " new spaceships and created " + numCreatures + " new creatures";
    }

    public String getName() {
        return name;
    }

    public ArrayList<SpaceShip> getSpaceships() {
        return spaceships;
    }

    public ArrayList<Creature> getCreatures() {
        return creatures;
    }
}