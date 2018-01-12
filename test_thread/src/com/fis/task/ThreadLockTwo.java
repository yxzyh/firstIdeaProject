package com.fis.task;

public class ThreadLockTwo extends Thread {

    @Override
    public void run() {
        int times = 0;
        while (times < 2){
            ThreadDo td = new ThreadDo(times);
            td.Do2();
            times++;
        }

    }
}
