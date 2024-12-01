package com.example.designpatterns.creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Get a Circle instance
        Shape circle = ShapeFactory.create("circle");
        circle.draw();

        // Get a Rectangle instance
        Shape rectangle = ShapeFactory.create("rectangle");
        rectangle.draw();

        // Get a Square instance
        Shape square = ShapeFactory.create("square");
        square.draw();

        try {
            Shape x = ShapeFactory.create("x");
            square.draw();
        }catch (Exception ex){
            System.out.println(ex.fillInStackTrace());
        }
    }
}
