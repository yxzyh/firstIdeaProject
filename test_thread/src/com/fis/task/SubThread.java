package com.fis.task;

public class SubThread extends Thread{
    private ThreadDo1 threadDo1;

    public SubThread(ThreadDo1 threadDo1) {
        this.threadDo1 = threadDo1;
    }

    @Override
    public void run() {
        for(int i = 0;i < 50;i++){
            threadDo1.subDo();
            System.out.println("******子第"+i+"次循环");
        }
    }
}
