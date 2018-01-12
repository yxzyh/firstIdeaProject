package com.fis.task;

public class ThreadDo {
    public int index = 0;
    public ThreadDo(int index) {
        this.index = index;
    }

    public void Do1(){
        synchronized (this){
            String name = Thread.currentThread().getName();
            System.out.println("线程：" + name + "第" + (this.index + 1) + "次运行！");
            while(this.index == 1){//本进程做完了，换另外一个进程
                notifyAll();//唤醒所有的进程

                try {
                    System.out.println("等待进程：" + name);
                    this.wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }
    }

    public void Do2(){
        synchronized (this){
            String name = Thread.currentThread().getName();
            System.out.println("线程：" + name + "第" + (this.index + 1) + "次运行！");
            while(this.index == 1){//本进程做完了，换另外一个进程
                notifyAll();//唤醒所有的进程

                try {
                    this.wait();
                    System.out.println("等待进程：" + name);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        }
    }
}
