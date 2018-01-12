package com.fis.thread;

public class TestThread5 {
    /**
     * 六．示例五：设计四个线程对象对同一个数据进行操作，

     两个线程执行减操作，两个线程执行加操作。



     程序分析：1.创建一个ThreadAddSub类继承Thread，重写run方法

     2.在run方法里面实现加和减的操作，每次操作后睡眠1秒

     3.创建主方法调用类


     */

    public static void main(String[] args) {
        //创建一个存放ThreadAddSub对象的数组。
        ThreadAddSub[] tsub = new ThreadAddSub[4];
        for(int i = 0;i < tsub.length;i++){
            //把实例化ThreadAddSub对象赋值到数组内
            //第1，3是true，2，4是false
            tsub[i] = new ThreadAddSub(i%2==0?true:false);

            //线程工作
            tsub[i].start();
        }
    }
}
