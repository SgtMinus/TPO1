package task3;

public class SpaceShip {
    private String name;
    private double maxSpeed;
    private double currentSpeed;
    private double[] coordinates = new double[3];


    public SpaceShip(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public SpaceShip(String name, double maxSpeed, double[] coordinates) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0;
        this.coordinates = coordinates;
    }

    public void accelerate(double acceleration) {
        double newSpeed = currentSpeed + acceleration;
        if (newSpeed <= maxSpeed) {
            currentSpeed = newSpeed;
        } else {
            currentSpeed = maxSpeed;
        }
    }

    public void decelerate(double deceleration) {
        double newSpeed = currentSpeed - deceleration;
        if (newSpeed >= 0) {
            currentSpeed = newSpeed;
        } else {
            currentSpeed = 0.0;
        }
    }

    public void move(double[] newCoordinates) {
        this.coordinates = newCoordinates;
    }


    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double[] getCoordinates() {
        return coordinates;
    }
}