package com.fis.thread;

public class PersonA extends Thread{
    //创建银行对象
    Bank bank;

    //通过构造器传入银行对象，确保两人进入的是同一家银行
    public  PersonA(Bank bank){
        this.bank = bank;
    }

    //重写run方法，在里面实现柜台取钱

    @Override
    public void run() {
        while(Bank.money > 100){
            bank.Counter(100);//每次取100元

        }
        try{
            sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
