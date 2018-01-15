package com.fis.task;

import sun.applet.Main;

public class Task7 {
    /**
     * （线程通信）子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，接着
     再回到主线程又循环100，如此循环50次。

     程序分析:
     1.创建一个ThreadDo1类，mainDo 和subDo方法，flage = true 主线运行子线程停止，flage = false，主线程停止子线程运行
     2.MainThread类，调用mainDo 50 次和SubThread类，调用SubDo50次。
     3.创建主函数定义和运行MainThread 类和 subThread类
     */

    public static void main(String[] args) {
        ThreadDo1 threadDo1 = new ThreadDo1();
        MainThread mainThread = new MainThread(threadDo1);
        SubThread subThread = new SubThread(threadDo1);


        mainThread.start();
        subThread.start();
    }

}
