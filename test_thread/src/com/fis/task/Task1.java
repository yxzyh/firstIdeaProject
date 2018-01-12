package com.fis.task;

public class Task1 {
    /**
     *  1. （多线程）代码实现火车站4个卖票窗口同时买票的场景，输出示例：
     窗口1卖票
     窗口2卖票
     窗口1卖票
     */
    public static void main(String[] args) {
        TickWin t1=new TickWin("窗口1");
        TickWin t2=new TickWin("窗口2");
        TickWin t3=new TickWin("窗口3");
        TickWin t4=new TickWin("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
