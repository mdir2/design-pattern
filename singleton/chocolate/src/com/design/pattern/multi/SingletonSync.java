package com.design.pattern.multi;

public class SingletonSync {
    private static SingletonSync uniqueInstance;

    private SingletonSync() {
    }

    public static synchronized SingletonSync getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSync();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                SingletonSync singletonSync = SingletonSync.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singletonSync);
            }
        };

        Thread thread1 = new Thread(runnable, "a");
        Thread thread2 = new Thread(runnable, "b");

        thread1.start();
        thread2.start();
    }
}
