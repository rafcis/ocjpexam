/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * The code compiles fine and prints Two, One, and Three 20 times each in an indefinite order
 */
public class OrderedThread {

    public static void main(String[] args) {
        MBThread first, second, third;
        OrderedThread orderedThread = new OrderedThread();
        first = new MBThread("One", orderedThread);
        second = new MBThread("Two", orderedThread);
        third = new MBThread("Three", orderedThread);
        second.start();
        first.start();
        third.start();
    }

    public void display(String msg) {
        synchronized (msg) {
            for (int i = 0; i < 20; i++) {
                System.out.println("Name= " + msg);
            }
        }
    }
}

class MBThread extends Thread {

    String name;
    OrderedThread orderT;

    MBThread(String name, OrderedThread orderT) {
        this.name = name;
        this.orderT = orderT;
    }

    public void run() {
        orderT.display(name);
    }
}
