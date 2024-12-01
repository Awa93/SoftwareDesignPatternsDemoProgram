package com.example.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        singleton01Demo();
        System.out.println("\n\n--------------------------------");

        singleton02Demo();
        System.out.println("\n\n--------------------------------");

        singleton03Demo();
        System.out.println("\n\n--------------------------------");

        singleton04Demo();
    }

    private static void singleton01Demo(){
        Singleton_01 singleton01 =  Singleton_01.getInstance();
        singleton01.showMessage("Singleton_01 instance 1 created "+singleton01.hashCode());
        Singleton_01 singleton02 =  Singleton_01.getInstance();
        singleton01.showMessage("Singleton_01 instance 2 created "+singleton02.hashCode());
    }

    private static void singleton02Demo(){
        Singleton_02 singleton01 =  Singleton_02.getInstance();
        singleton01.showMessage("Singleton_02 instance 1 created "+singleton01.hashCode());
        Singleton_02 singleton02 =  Singleton_02.getInstance();
        singleton01.showMessage("Singleton_02 instance 2 created "+singleton02.hashCode());
    }

    private static void singleton03Demo(){
        Singleton_03 singleton01 =  Singleton_03.getInstance();
        singleton01.showMessage("Singleton_03 instance 1 created "+singleton01.hashCode());
        Singleton_03 singleton02 =  Singleton_03.getInstance();
        singleton01.showMessage("Singleton_03 instance 2 created "+singleton02.hashCode());
    }

    private static void singleton04Demo(){
        Singleton_04 singleton01 =  Singleton_04.getInstance();
        singleton01.showMessage("Singleton_04 instance 1 created "+singleton01.hashCode());
        Singleton_04 singleton02 =  Singleton_04.getInstance();
        singleton01.showMessage("Singleton_04 instance 2 created "+singleton02.hashCode());
    }
}
