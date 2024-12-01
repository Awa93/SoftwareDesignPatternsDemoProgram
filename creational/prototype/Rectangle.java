package com.example.designpatterns.creational.prototype;

public class Rectangle implements Prototype {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Prototype clone() {
        // Return a deep copy of the Rectangle object
        return new Rectangle(this.width, this.height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}