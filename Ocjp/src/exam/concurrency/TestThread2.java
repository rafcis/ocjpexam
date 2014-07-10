/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Compiler error, line 19,20,21
 */
class TestThread2 extends Thread {

    public void restart() {
        startMe();
    }

    public static startMe() {
        synchronized (this) {
            notifyAll();
            System.out.println("Trying to notify");
        }
    }

    public void run() {
        try {
            synchronized (this) {
                wait();
                System.out.println("Notified");
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2();
        t1.start();
        t1.restart();
    }
}
