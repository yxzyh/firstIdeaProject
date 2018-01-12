package com.fis.task;

public class Task3 {
    /**
     * 3. （线程通信）小明打算去提款机上取钱，发现卡上没钱，这时候他告知妈妈去存钱，妈妈
     存了钱了，告知小明存好了可以取钱了。(PS:小明分多次取钱，每次取100，当发现钱不够
     100，每次存2就等待妈妈存钱，小明他妈000，当发现钱小于100就存钱，就存钱，并且
     通知小明去取钱，当大于100就等待小明钱不够是再存)
     */

    public static void main(String[] args) {
        Account account = new Account();

        XiaoMing xiaoMing = new XiaoMing(account);
        Mother mother = new Mother(account);

        xiaoMing.start();
        mother.start();
    }
}
