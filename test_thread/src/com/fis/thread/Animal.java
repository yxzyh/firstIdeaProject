package com.fis.thread;

public abstract class Animal extends Thread {

    public double length = 20;//the run way length
    public abstract void running();//abstract function need implement in sub function.

    //在父类重写run 方法，在子类只要重写running方法就可以了。
    @Override
    public void run() {
        super.run();
        while (length > 0){
            running();
        }
    }



    //创建接口对象
    public Calltoback calltoback;
}
