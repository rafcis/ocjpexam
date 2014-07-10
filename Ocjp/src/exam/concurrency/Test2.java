/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Prints "AABB" or "BBAA
 */
class Test2 implements Runnable {

    public void run() {
        String str = "hello";
        synchronized (str) {
            try {
                System.out.print(Thread.currentThread().getName());
                Thread.sleep(500);
                System.out.print(Thread.currentThread().getName());
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Test2(), "A").start();
        new Thread(new Test2(), "B").start();
    }
}
