package com.fis.thread;

public class TestThread2 {
    /**
     *

     三．示例二：两个人AB通过一个账户A在柜台取钱和B在ATM机取钱！



     程序分析：钱的数量要设置成一个静态的变量。两个人要取的同一个对象值
     */
    public static void main(String[] args) {
        //实例化一个银行对象
        Bank bank = new Bank();
        //实例化两个人，传入同一个银行对象
        PersonA pA = new PersonA(bank);
        PersonB pB = new PersonB(bank);
        //两人开始取钱
        pA.start();
        pB.start();




    }
}
