package com.example.designpatterns.creational.prototype;

public class Circle implements Prototype {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public Prototype clone() {
        // Return a deep copy of the Circle object
        return new Circle(this.radius, this.color);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}