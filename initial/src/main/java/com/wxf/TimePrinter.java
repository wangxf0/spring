package com.wxf;

import java.util.Date;


public class TimePrinter implements Runnable{
    int pauseTime;
    String name;

    public TimePrinter(int x, String n){
        pauseTime = x;
        name = n;
    }
    public synchronized void run(){
        while (true){
            System.out.println(name + ":" + new Date(System.currentTimeMillis()));
            try {
                Thread.sleep(pauseTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Thread t1=new Thread(new TimePrinter(1000,"fast guy"));
        t1.start();
        Thread t2=new Thread(new TimePrinter(3000,"slow guy"));
        t2.start();

    }
}
