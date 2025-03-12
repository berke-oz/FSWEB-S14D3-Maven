package org.example.company;

import java.util.Objects;

public class Car {
    private  boolean engine = true;
    private int cylinders;
    private String name;
    private  int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String startEngine() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return "the car is accelerating";
    }


    public String brake() {
        System.out.println("Class Name " + getClass().getSimpleName());
        return "the car is braking";
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

