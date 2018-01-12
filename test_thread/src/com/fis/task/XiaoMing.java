package com.fis.task;

public class XiaoMing extends Thread{
    Account account;
    public XiaoMing(Account account) {
        this.account = account;//保证是同一个帐户
    }

    @Override
    public void run() {
        while (true){
            account.takeMoney();//取钱

            try {
                sleep(1000);//休息1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
