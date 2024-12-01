package com.example.designpatterns.creational.singleton;

/*Reduces overhead by synchronizing only the first time the instance is created.
* Thread-safe.
* Reduces synchronization overhead.
* */
public class Singleton_04 {
    private static volatile Singleton_04 INSTANCE;

    private Singleton_04() {
    }

    // Synchronized method to provide thread-safe access
    public static Singleton_04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton_04.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton_04();
                }
            }
        }
        return INSTANCE;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
