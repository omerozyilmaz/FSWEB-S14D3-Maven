package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

//    public ElectricCar(double avgKmPerLitre, int batterySize) {
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.batterySize = batterySize;
//    }

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {

        return getClass().getSimpleName() + super.startEngine();
    }

    @Override
    public String drive() {
        return getClass().getSimpleName() + super.drive();
    }
}
