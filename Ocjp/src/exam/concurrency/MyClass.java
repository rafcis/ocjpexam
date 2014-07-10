/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * Constructors:
 * Thread()
 * Thread(Runnable target)
 * Thread(Runnable target, String name)
 * Thread(String name)
 * Thread(ThreadGroup group, Runnable target)
 * Thread(ThreadGroup group, Runnable target, String name)
 * Thread(ThreadGroup group, Runnable target, String name, long stackSize)
 * Thread(ThreadGroup group, String name)
 */
class MyClass implements Runnable {

    public void run() {
    }
}

class Test {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(); 				// 1
        Thread t2 = new Thread(new MyClass()); 	// 2
        Thread t3 = new Thread(new MyClass(), "Thread3"); 	// 3
        Thread t4 = new Thread("Thread4"); 		// 4
        Thread t5 = new Thread("Thread5", 5); 	// 5
        Thread t6 = new Thread("Thread6", new MyClass()); 	// 6
    }
}
