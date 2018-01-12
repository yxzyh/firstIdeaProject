package com.fis.thread;

public class Waiter extends Thread {
    KFC kfc;

    public Waiter(KFC kfc){
        this.kfc = kfc;//kfc 要传入保证每个服务员和客户都在同一个kfc里
    }

    @Override
    public void run() {
        int size = (int)(Math.random()*5) + 5;//每次要生产的数量
        while (true){
            kfc.prod(size);//把参数传入到生产方法里
        }
    }
}
