package com.fis.thread;

public class Customer extends Thread {

    KFC kfc;
    public Customer(KFC kfc){
        this.kfc = kfc;//kfc 要传入保证每个服务员和客户都在同一个kfc里
    }

    @Override
    public void run() {
        int size = (int)(Math.random()*5);//每次要消费的食物。
        while (true){
            kfc.consu(size);//在消费的方法里传入参数
        }
    }
}
