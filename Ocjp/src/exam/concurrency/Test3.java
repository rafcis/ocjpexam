/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Output cannot be predicted
 */
class MyRunnable implements Runnable {

    String[] s;

    public MyRunnable(String[] s) {
        this.s = s;
    }

    public void run() {
        synchronized (this) {
            try {
                wait(5000);
                System.out.println(s[0] + s[1] + s[2]);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Test3 {

    public static void main(String[] args) throws Exception {
        String[] s = new String[]{"1", "2", "3"};
        MyRunnable myRunnable = new MyRunnable(s);
        Thread t1 = new Thread(myRunnable);
        t1.start();
        t1.join(5000);
        s[0] = "A";
        s[1] = "B";
        s[2] = "C";
    }
}
