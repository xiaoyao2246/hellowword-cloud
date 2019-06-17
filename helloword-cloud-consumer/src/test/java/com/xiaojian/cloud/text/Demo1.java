package com.xiaojian.cloud.text;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo1 implements Callable {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask task = new FutureTask(new Demo1());
        Thread thread = new Thread(task);

        thread.start();
        System.out.println(task.get());
    }

    @Override
    public Object call() throws Exception {
        System.out.println("当前线程" + Thread.currentThread().getName());
        return 111;
    }

    class MyThread implements Callable {

        @Override
        public Object call() throws Exception {
            System.out.println("当前线程" + Thread.currentThread().getName());
            return 111;
        }
    }

}
