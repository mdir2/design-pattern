package com.design.pattern.classic;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                Singleton classic = Singleton.getInstance();
                System.out.println(classic);
            }
        };

        Thread thread1 = new Thread(runnable, "a");
        Thread thread2 = new Thread(runnable, "b");
        Thread thread3 = new Thread(runnable, "c");
        Thread thread4 = new Thread(runnable, "d");
        Thread thread5 = new Thread(runnable, "e");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
