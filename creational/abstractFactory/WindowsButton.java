package com.example.designpatterns.creational.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button.");
    }
}
