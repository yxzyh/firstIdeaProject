package com.fis.task;

public class Mother extends Thread{
    Account account;
    public Mother(Account account){
        this.account = account;//确保同一个帐户
    }

    //存钱

    @Override
    public void run() {
        while (true){
            this.account.storeMoney();//存钱

            try {
                sleep(1000);//休息1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
