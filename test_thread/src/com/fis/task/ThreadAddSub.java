package com.fis.task;

public class ThreadAddSub extends Thread {
    boolean operate = true;//true,相加;false,相减
    static int sum = 0;//要操作的数

    public ThreadAddSub(boolean operate){
        this.operate = operate;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            if(operate){
                sum += 5;
                System.out.println("相加后 sum = " + sum);
            }else {
                sum -= 4;
                System.out.println("相减后 sum = " + sum);
            }

            try {
                sleep(1000);//休息1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
