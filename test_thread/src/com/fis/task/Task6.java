package com.fis.task;

public class Task6 {
    /**
     * （线程同步）设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。
     *
     * 程序分析：
     *
     * 1.创建一个操作类 DataJ，继承Thread,重写run方法。
     * 2.传递参数，true，对j加1，false，就j减1.在run方法里实现加减。
     * 3.创建主函数，调用DataJ。
     */

    public static void main(String[] args) {

        DataJ[] dj = new DataJ[4];
        for (int i = 0;i < dj.length;i++){
            dj[i] = new DataJ(i%2==0?true:false);
            dj[i].start();
        }
    }
}
