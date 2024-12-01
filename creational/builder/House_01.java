package com.example.designpatterns.creational.builder;

/*
* Non builder class
* */
public class House_01 {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House_01(int windows, int doors, boolean hasGarage, boolean hasSwimmingPool) {
        this.windows = windows;
        this.doors = doors;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" + "windows=" + windows + ", \ndoors=" + doors + ", \nhasGarage=" + hasGarage + ", \nhasSwimmingPool=" + hasSwimmingPool + "}";
    }
}
