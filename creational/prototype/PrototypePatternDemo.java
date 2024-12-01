package com.example.designpatterns.creational.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        // Create original objects
        Circle originalCircle = new Circle(10, "Red");
        Rectangle originalRectangle = new Rectangle(20, 30);

        // Clone the objects
        Circle clonedCircle = (Circle) originalCircle.clone();
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        // Print original and cloned objects
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}