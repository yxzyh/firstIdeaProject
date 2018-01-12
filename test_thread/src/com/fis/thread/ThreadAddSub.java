package com.fis.thread;

public class ThreadAddSub extends Thread{
    //true：相加,false:相减
    boolean operate = true;

    //要操作的数
    static int sum = 0;

    //把操作运算通过参数传递过来。
    public ThreadAddSub(boolean operate) {
        this.operate = operate;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            if(operate){
                sum+=5;
                System.out.println("加后，sum=" + sum);
            }else{
                sum-=4;
                System.out.println("减后，sum=" + sum);
            }

            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
