package com.fis.task;

public class Account {
    //初始化小明ATM的金额
    static int money = 234;

    //取钱的方法
    public void takeMoney(){
        synchronized(this){//锁定ATM方法

            //钱不够
            while (money < 100){
                System.out.println("取钱时，钱不够！");
                this.notifyAll();//唤醒所有进程，有all
                String name = Thread.currentThread().getName();
                try {
                    this.wait();//钱不够，等钱
                    System.out.println("使线程等待：" + name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //钱够
            while (money > 100){
                System.out.println("取钱时，钱够！");
                money -= 100;//每次去走100
                System.out.println("取走了100，还剩" + money);
            }
        }
    }

    public void storeMoney(){

        synchronized (this){
            //钱够
            while (money > 100){
                System.out.println("存钱时，钱够！");
                this.notifyAll();//唤醒所有进程，有all
                String name = Thread.currentThread().getName();
                try {
                    wait();//让线程等待
                    System.out.println("使线程等待：" + name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            if(money < 100){
                money += 1000;//存钱 1000
                System.out.println("存了1000，剩余金额：" + money);
            }

        }

    }

}
