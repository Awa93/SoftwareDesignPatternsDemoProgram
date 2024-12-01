package com.example.designpatterns.creational.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        //Non Builder Pattern example
        House_01 house01 = new House_01(4, 2,true, true);
        System.out.println(house01);
        System.out.println("\n");
        //Builder Pattern example
        House_02.HouseBuilder builder = new House_02.HouseBuilder();
        House_02 house02 = builder.setWindows(4)
                .setDoors(2)
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .build();
        System.out.println(house02);
    }
}
