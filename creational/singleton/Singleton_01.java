package com.example.designpatterns.creational.singleton;

/*The instance is created at the time of class loading.
* Simple and thread-safe (JVM handles it).
* Instance is created even if it's never used.
* */
public class Singleton_01 {
    private static final Singleton_01 INSTANCE =  new Singleton_01();

    private Singleton_01(){}
    public static Singleton_01 getInstance(){
        return INSTANCE;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}



