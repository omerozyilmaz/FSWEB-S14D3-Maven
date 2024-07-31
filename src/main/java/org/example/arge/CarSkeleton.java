package org.example.arge;

public class CarSkeleton {
    private String name;
    private String  description;

    public CarSkeleton() {
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        return " car`s engine starting.";
    }
    public String drive(){
        runEngine();
        return " person  driveng.";
    }

    public void runEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.getClass().getSimpleName());
        if (carSkeleton instanceof ElectricCar) {
            ElectricCar electricCar = ((ElectricCar) carSkeleton);
            System.out.println("The car engine is starting with electric. Per charge: " + electricCar.getAvgKmPerCharge() + " battery size: " + electricCar.getBatterySize());
        } else if (carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = ((HybridCar) carSkeleton);
            System.out.println("The car engine is starting with hybrid. Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize() + " cylinder: " + hybridCar.getCylinders());
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("The car engine is starting with gaspowered car: per charge: " + gasPoweredCar.getAverageKmPerLiter());
        } else {
            System.out.println("invalid car type!");
        }

    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object carSkeleton) {
        return ((CarSkeleton)carSkeleton).name.equals(name) && ((CarSkeleton)carSkeleton).description.equals(description);
    }

}
