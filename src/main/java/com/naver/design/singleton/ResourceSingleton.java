package com.naver.design.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceSingleton {
    private ResourceSingleton(){}

    private static volatile ResourceSingleton instance = null;
    private static Lock lock = new ReentrantLock();

    public static ResourceSingleton getInstance() {
        if (instance == null) {
            try {
                lock.lock();
                if (instance == null) {
                    instance = new ResourceSingleton();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }
}