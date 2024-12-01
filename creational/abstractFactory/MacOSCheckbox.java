package com.example.designpatterns.creational.abstractFactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Checkbox.");
    }
}