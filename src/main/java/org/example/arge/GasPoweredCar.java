package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
private double avgKmPerLitre;
private  int cylinders;

//    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.cylinders = cylinders;
//    }

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
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
