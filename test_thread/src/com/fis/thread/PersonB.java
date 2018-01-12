package com.fis.thread;

public class PersonB extends Thread{
    //创建银行对象
    Bank bank;

    //通过构造函数传入银行对象，确保两个人进入同一个银行
    public PersonB(Bank bank){
        this.bank = bank;
    }

    //重写run 方法，在里面实现使用ATM取钱

    @Override
    public void run() {
        while (Bank.money > 200){
            bank.ATM(200);//每次取两百
        }

        try{
            sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
