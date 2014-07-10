/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Throws exception at runtime
 * java.lang.IllegalMonitorStateException
 */
class MyThread extends Thread {

    String sa;

    public MyThread(String sa) {
        this.sa = sa;
    }

    public void run() {
        synchronized (sa) {
            while (!sa.equals("Done")) {
                try {
                    sa.wait();
                } catch (InterruptedException ie) {
                }
            }
        }
        System.out.println(sa);
    }
}

class Test1 {

    private static String sa = new String("Not Done");

    public static void main(String[] args) {
        Thread t1 = new MyThread(sa);
        t1.start();
        synchronized (sa) {
            sa = new String("Done");
            sa.notify();
        }
    }
}
