package com.fis.task;

public class Operate extends Thread{
    DataJ dj = null;
    boolean flage = true;

    public Operate(DataJ dj) {
        this.dj = dj;
    }

    @Override
    public void run() {
        super.run();
    }
}
