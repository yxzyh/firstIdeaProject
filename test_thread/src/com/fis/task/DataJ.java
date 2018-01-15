package com.fis.task;

public class DataJ extends Thread{

    static int j = 0;
    boolean operate = true;

    public DataJ(boolean operate) {
        this.operate = operate;
    }

    @Override
    public void run() {
        while (true){
            if(this.operate){
                j++;
                System.out.println("j = " + j);
            }else{
                j--;
                System.out.println("j = " + j);
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
