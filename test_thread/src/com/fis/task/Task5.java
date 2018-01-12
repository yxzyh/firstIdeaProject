package com.fis.task;

public class Task5 {
    /**
     *  5. （线程通信）制作两个线程对象，要求用同步块的方式使第一个线程运行2次，然后将自己
     阻塞起来，唤醒第二个线程，第二个线程再运行2次，然后将自己阻塞起来，唤醒第一个线
     程……两个线程交替执行。

     程序分析：
     1.创建一个ThreadLock 类，继承Thread，重写run方法。
     2.在run方法里实现运行2次就锁自己线程，同时唤醒其他线程。
     3.创建主方法，调用ThreadLock类。
     */

    public static void main(String[] args) {
        ThreadLockOne threadLock1 = new ThreadLockOne();
        ThreadLockTwo threadLock2 = new ThreadLockTwo();

        threadLock1.start();
        threadLock2.start();

    }
}
