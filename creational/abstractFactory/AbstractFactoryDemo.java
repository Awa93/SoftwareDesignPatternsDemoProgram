package com.example.designpatterns.creational.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Choose a factory dynamically (e.g., based on configuration or input)
        UIFactory factory;

        String osType = "MacOS"; // Change to "Windows" to test the other factory
        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        // Create and use products
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}