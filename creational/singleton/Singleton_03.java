package com.example.designpatterns.creational.singleton;

/*Use synchronization to make the getInstance method thread-safe.
 * Thread-safe.
 * Synchronization adds overhead.
 * */
public class Singleton_03 {
    private static Singleton_03 INSTANCE;

    private Singleton_03() {
    }

    // Synchronized method to provide thread-safe access
    public static synchronized Singleton_03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton_03();
        }
        return INSTANCE;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}