package com.fis.task;

public class TickWin extends Thread{
    private static int tickets = 100;
    private String name="";

    public TickWin(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(tickets == 0){
                    break;
                }
                tickets--;
                System.out.println(name+"卖票,剩下" + tickets + "张票");
            }


        }

    }
}
