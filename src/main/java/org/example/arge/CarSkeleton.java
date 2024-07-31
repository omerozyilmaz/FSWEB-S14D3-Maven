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
    protected String runEngine(){
        return " car`s engine  running.";
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
    public String carDescription() {
        return null;
    }

}
