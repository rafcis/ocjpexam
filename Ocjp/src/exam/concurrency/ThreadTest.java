/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * The code will not compile, line 18
 */
public class ThreadTest implements Runnable {

    private int x;

    public int getData() {
        synchronized (x) {
            x = 123;
            x = x + 12;
        }
        return x;
    }

    public void run() {
        System.out.println(getData() + " ");
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread th1 = new Thread(test);
        Thread th2 = new Thread(test);
        th1.start();
        th2.start();
    }
}
