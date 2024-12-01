package com.example.designpatterns.creational.abstractFactory;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button.");
    }
}