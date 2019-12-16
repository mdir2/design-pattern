package com.design.pattern.multi;

public class SingletonDCL {
    private volatile static SingletonDCL uniqueInstace;

    private SingletonDCL() {
    }

    public static SingletonDCL getInstance() {
        if (uniqueInstace == null) {
            synchronized (SingletonDCL.class) {
                if (uniqueInstace == null) {
                    uniqueInstace = new SingletonDCL();
                }
            }
        }
        return uniqueInstace;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                SingletonDCL singletonDCL = getInstance();
                System.out.println(singletonDCL);
            }
        };

        Thread thread1 = new Thread(runnable, "a");
        Thread thread2 = new Thread(runnable, "b");
        thread1.start();
        thread2.start();
    }
}
