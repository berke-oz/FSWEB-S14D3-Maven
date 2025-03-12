package org.example.arge;

public class Main {
    public static void main(String[] args) {
        // Arabaların örneklerini oluşturuyoruz
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A gas-powered car", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "A fully electric car", 500, 75);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A car with both gasoline and electric power", 12.0, 50, 4);

        // Her arabayı test ediyoruz
        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        // Motoru başlatma
        car.startEngine();

        // Arabayı sürme
        car.drive();

        // Arabayı çalıştırma metodunu çağırma ve sınıfın tipini yazdırma
        System.out.println("Car type: " + car.getClass().getSimpleName());
        System.out.println();
    }
}
