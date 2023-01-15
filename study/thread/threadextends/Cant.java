package com.study.thread.threadextends;

class Coba implements Runnable
{
    public void run(){
        while (true){
            System.out.println("This is a some Thread!");
            if (Thread.currentThread().isInterrupted()) //cek status
                break;
        }
    }
}

public class Cant {
    public static void main(String[] args) {
        Thread v1 = new Thread(new Coba());
        v1.start();
        Thread v2 = new Thread(new Coba());
        v2.start();
    }
}