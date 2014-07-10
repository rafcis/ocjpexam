package exam.concurrency;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafcis
 * It will compile and run with success and the run method of SimpleThread class will be executed twice by two separate threads created.
 */
class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE!" + getName());
    }
}

public class TwoThreadDemo {

    public static void main(String[] args) {
        new SimpleThread("Java Programmer").start(); 	//line A
        new SimpleThread("Java Programmer").start(); 	//line B
    }
}
