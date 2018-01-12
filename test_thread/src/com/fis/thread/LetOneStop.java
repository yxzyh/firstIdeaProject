package com.fis.thread;

public class LetOneStop implements Calltoback {
    //动物对象
    Animal an;

    //获取动物对象，可以传入兔子或乌龟实例
    public LetOneStop(Animal an){
        this.an = an;
    }

    @Override
    public void win(){
        an.stop();
    }



}
