package com.fis.thread;

public class Rabbit extends Animal {

    public Rabbit(){
        setName("兔子");//线程方法，给线程赋值。
    }


    @Override
    public void running() {
        //跑的距离
        double dis = 0.5;
        length -= dis;//跑完后距离减少
        if(length <= 0){
            length = 0;
            System.out.println("兔子获得胜利！");
            //给回调对象赋值，让乌龟不要再跑了
            if(calltoback != null){
                calltoback.win();
            }
        }
        System.out.println("兔子跑了" + dis + "米，距离终点还有"+(int)length + "米");

        if(length % 2 == 0){//两米休息一次
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }

}
