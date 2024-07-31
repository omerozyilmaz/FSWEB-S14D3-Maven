package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.company.Car;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5,"Base Car ");
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());
        Car car2 = new Mitsubishi(5,"Base Mitsubishi ");
        System.out.println(car2.getName()+car2.getCylinders());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());
        CarSkeleton elek = new ElectricCar("Tesla","Electrical motor",302, 300);
        System.out.println(elek.startEngine());
        System.out.println(elek.getName() + elek.getDescription() +elek.carDescription());

    }
}