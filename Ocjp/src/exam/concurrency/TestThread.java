/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * The code will not compile, incorrect placement synchronized modifierr
 */
public class TestThread extends Thread {

    public static void main(String[] args) {
        new TestThread().start();
        new TestThread().start();
    }

    public void run() {
        Safe s1 = new Safe("abc");
        Safe s2 = new Safe("xyz");
    }
}

class Safe {

    private String str;

    public synchronized Safe(String s) {
        str = s;
        str.toUpperCase();
        System.out.println(str + " ");
    }
}
