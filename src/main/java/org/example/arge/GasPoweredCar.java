package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double averageKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }


    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " (Gas): Engine started with gasoline.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " (Gas): Driving with gasoline power...");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getName() + " (Gas): Engine is running using " + cylinders + " cylinders and " + averageKmPerLiter + " km/l efficiency.");
    }
}
