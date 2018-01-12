package com.fis.thread;

public class TestThread4 {
    /**
     *
     * 五．实例四:

     在一个KFC内，服务员负责生产食物，消费者负责消费食物；

     当生产到一定数量可以休息一下，直到消费完食物，再马上生产，一直循环



     程序涉及到的内容：

     1.这设计到java模式思想：生产者消费者模式

     2.要保证操作对象的统一性，即消费者和服务者都是跟同一个KFC发生关系的，KFC只能new一次

     3.this.notifyAll();和 this.wait();一个是所有唤醒的意思，一个是让自己等待的意思；

     比如本题中，生产者生产完毕后，先所有唤醒（包括消费者和生产者），再让所有自己（生产者）等待

     这时，消费者开始消费，直到食材不够，先所有唤醒（包括消费者和生产者），再让所有自己（消费者）等待

     一直执行上面的操作的循环

     4.生产者和消费者都要继承Thread，才能实现多线程的启动





     程序设计的步骤思路：

     1.创建一个食物类Food，有存放/获取食物的名称的方法

     2.创建一个KFC类，有生产食物和消费食物的方法

     3.创建一个客户类Customer，继承Thread，重写run方法，在run方法里面进行消费食物操作

     4.创建一个服务员类Waiter，继承Thread，重写run方法，在run方法里面进行生产食物的操作

     5.创建主方法的调用类
     */

    public static void main(String[] args) {
        //只实例化一个KFC
        KFC kfc = new KFC();

        //实例化4个客户
        Customer c1 = new Customer(kfc);
        Customer c2 = new Customer(kfc);
        Customer c3 = new Customer(kfc);
        Customer c4 = new Customer(kfc);

        //实例化3个服务员
        Waiter w1 = new Waiter(kfc);
        Waiter w2 = new Waiter(kfc);
        Waiter w3 = new Waiter(kfc);



        //让所有线程开始工作
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        w1.start();
        w2.start();
        w3.start();

    }
}
