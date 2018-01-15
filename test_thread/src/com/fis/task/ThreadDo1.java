package com.fis.task;

public class ThreadDo1 {
    boolean flage = false;

    public void mainDo(){
        synchronized (this){
            while (!flage){
                try {
                    this.wait();//flage = false 主线程等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(flage){
                for(int i = 0;i < 100;i++){
                    System.out.println("主线程"+Thread.currentThread().getName()+"第"+i+"次打印。");
                }
                flage = false;
                this.notifyAll();
            }
        }


    }

    public void subDo(){
        synchronized (this){
            while (flage){
                try {
                    this.wait();//flage = true 主线程等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(!flage){
                for(int i = 0;i < 10;i++){
                    System.out.println("子线程"+Thread.currentThread().getName()+"第"+i+"次打印。");
                }
                flage = true;
                this.notifyAll();
            }
        }

    }
}
