package com.example.designpatterns.creational.singleton;

/*The instance is created only when it is accessed for the first time.
* Instance is created only when needed.
* Not thread-safe
* */
public class Singleton_02 {
    private static Singleton_02 INSTANCE;

    private Singleton_02(){}
    public static Singleton_02 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton_02();
        }
        return INSTANCE;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}

