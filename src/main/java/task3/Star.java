package task3;

public class Star {
    private String name;
    private double radius;
    private double temperature;
    private double[] coordinates;

    public Star(String name, double radius, double temperature, double[] coordinates) {
        this.name = name;
        this.radius = radius;
        this.temperature = temperature;
        this.coordinates = coordinates;
    }

    public void explode() {
        temperature = Double.POSITIVE_INFINITY;
        radius = 0;
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

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }
}