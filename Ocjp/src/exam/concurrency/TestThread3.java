/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Compiler error, onstructor TestThread3 in class TestThread3 cannot be applied to given types
 */
class TestThread3 extends Thread {

    static String s = new String("hi");

    public void run() {
        try {
            synchronized (s) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        TestThread3 t1 = new TestThread3("A");
        TestThread3 t2 = new TestThread3("B");
        t1.start();
        t2.start();
    }
}
