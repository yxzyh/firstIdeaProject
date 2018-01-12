package com.fis.task;

public class Task4 {
    /**
     * 4. (线程同步)设计四个线程对象对同一个数据进行操作，两个线程执行减操作，两个线程执行
     加操作。

     程序分析：
     1.创建一个 ThreadAddSub 类继承Thread，重写run方法。
     2.在run方法实现加减操作，每次操作后休息1秒。
     3.创建主方法调用ThreadAddSub类
     */

    public static void main(String[] args) {
        //创建一个存放ThreadAddSub的数组
        ThreadAddSub[] tsub = new ThreadAddSub[4];

        //给数组赋值
        for(int i = 0;i < tsub.length;i++){
            //把实例化，赋值到数组里
            //1，3为true，相加，2，4为false相减
            //new ThreadAddSub(true);
            tsub[i] = new ThreadAddSub(i%2==0?true:false);
            //开始线程
            tsub[i].start();
        }
    }
}
