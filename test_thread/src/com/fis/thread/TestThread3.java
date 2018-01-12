package com.fis.thread;

/**
 *
 * 四．示例三：龟兔赛跑问题



 龟兔赛跑：20米     //只要为了看到效果，所有距离缩短了

 要求：

 1.兔子每秒0.5米的速度，每跑2米休息10秒，

 2.乌龟每秒跑0.1米，不休息

 3.其中一个跑到终点后另一个不跑了！

 程序设计思路：

 1.创建一个Animal动物类，继承Thread，编写一个running抽象方法，重写run方法，把running方法在run方法里面调用。

 2.创建Rabbit兔子类和Tortoise乌龟类，继承动物类

 3.两个子类重写running方法

 4.本题的第3个要求涉及到线程回调。需要在动物类创建一个回调接口，创建一个回调对象
 */
public class TestThread3 {
    public static void main(String[] args) {
        //实例化兔子和乌龟
        Tortoise tortoise = new Tortoise();
        Rabbit rabbit = new Rabbit();
        //回调方法的使用，谁先调用callback方法，另外一个就不跑
        LetOneStop letOneStop1 = new LetOneStop(tortoise);
        rabbit.calltoback = letOneStop1;//兔子调乌龟对象，乌龟不跑
        LetOneStop letOneStop2 = new LetOneStop(rabbit);
        tortoise.calltoback = letOneStop2;//乌龟调兔子对象，兔子不跑

        //开始跑
        tortoise.start();
        rabbit.start();

    }
}
