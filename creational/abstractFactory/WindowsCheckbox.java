package com.example.designpatterns.creational.abstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox.");
    }
}