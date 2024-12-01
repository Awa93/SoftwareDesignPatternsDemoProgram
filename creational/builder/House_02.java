package com.example.designpatterns.creational.builder;

public class House_02 {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Private Constructor
    private House_02(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    // Builder Class
    public static class HouseBuilder {
        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        // Setter methods returning the builder for method chaining
        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // Build method to create the House object
        public House_02 build() {
            return new House_02(this);
        }
    }
}