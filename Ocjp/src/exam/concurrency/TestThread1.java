/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 */
class TestThread1 extends Thread {

    private int i;
    static String s = new String("hi");

    TestThread1(String s) {
        super(s);
    }

    public String getObj() {
        return s;
    }

    public void run() {
        try {
            synchronized (this.getObj()) {
                System.out.println(
                        Thread.currentThread().getName()
                );
                Thread.sleep(1000);
                System.out.println(
                        Thread.currentThread().getName()
                );
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        TestThread1 t1 = new TestThread1("A");
        TestThread1 t2 = new TestThread1("B");
        t1.start();
        t2.start();
    }
}
