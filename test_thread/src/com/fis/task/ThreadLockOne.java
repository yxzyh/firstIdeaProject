package com.fis.task;

public class ThreadLockOne extends Thread {

    @Override
    public void run() {
        int times = 0;
        while (times % 2 > 0){
            ThreadDo td = new ThreadDo(times);
            td.Do1();
            times++;
        }

    }
}
