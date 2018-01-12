package com.fis.thread;

public class Station extends Thread  {
    //通过构造方法给线程赋值
    public Station(String name){
        super(name);//给线程赋值
    }
    //为了保存票数一致，票数为静态值
    static int ticks = 20;

    //创建一个静态钥匙
    static Object ob = "abcd";

    @Override
    public void run() {
        while(ticks > 0){
            synchronized(ob){
                // 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if(ticks > 0){
                    System.out.println(getName() + "卖出了第" + ticks +"张票！" );
                    ticks--;
                }else{
                    System.out.println("票已经售完！");
                }

                }

                try{
                    sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

    }
}
