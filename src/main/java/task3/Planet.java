package task3;

import java.util.ArrayList;

public class Planet {
    private String name;
    private double radius;
    private String type;
    private ArrayList<Double> coordinates;
    private ArrayList<Creature> population;

    public Planet(String name, double radius, String type, ArrayList<Double> coordinates) {
        this.name = name;
        this.radius = radius;
        this.type = type;
        this.coordinates = coordinates;
        this.population = new ArrayList<Creature>();
    }

    public void createPopulation(int count) {
        for (int i = 0; i < count; i++) {
            Creature creature = new Creature("Creature " + i, (int) (Math.random()*1000), name + "er");
            population.add(creature);
        }
    }

    public void changeType(String newType) {
        this.type = newType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public ArrayList<Creature> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<Creature> population) {
        this.population = population;
    }
}