package com.fis.task;

public class ThreadLockTwo extends Thread {

    @Override
    public void run() {
        int times = 0;
        while (true){
            ThreadDo td = new ThreadDo(times);
            td.Do2();
            times++;

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
