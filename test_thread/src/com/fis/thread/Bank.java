package com.fis.thread;

public class Bank {
    //假设帐号有1000元
    static int money = 10000;

    //柜台取钱的方法
    public void Counter(int money){//参数是每次取走的钱
        Bank.money -= money;//取走钱后，总钱数减少
        System.out.println("A 在柜台取走了" + money + "元，还剩下" + Bank.money);
    }

    //ATM取钱的方法
    public void ATM(int money){//参数是每次取走的钱
        Bank.money -= money;//取走钱后，总钱数减少
        System.out.println("B 在ATM取走了" + money + "元，还剩下" + Bank.money);
    }

}
