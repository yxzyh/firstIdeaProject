package com.fis.task;

public class MainThread extends Thread{
    private ThreadDo1 threadDo1;

    public MainThread(ThreadDo1 threadDo1) {
        this.threadDo1 = threadDo1;
    }

    @Override
    public void run() {
        for(int i = 0;i < 50;i++){
            threadDo1.mainDo();
            System.out.println("******主第"+i+"次循环");
        }
    }
}
