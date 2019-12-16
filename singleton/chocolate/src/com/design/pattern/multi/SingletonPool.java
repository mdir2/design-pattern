package com.design.pattern.multi;

public class SingletonPool {
    private static SingletonPool uniqueInstance = new SingletonPool();

    private SingletonPool() {
    }

    public static SingletonPool getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                SingletonPool singletonPool = SingletonPool.getInstance();
                System.out.println(Thread.currentThread().getName() + ":" + singletonPool);
            }
        };

        Thread thread1 = new Thread(runnable, "a");
        Thread thread2 = new Thread(runnable, "b");

        thread1.start();
        thread2.start();
    }
}
