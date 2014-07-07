/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * cannot implement f()
 */
abstract class SuperTest1 {

    static int i = 10;
}

class Test11 extends SuperTest1 implements Inter {

    final static int i;

    static {
        i = 9;
    }

    void f() {
        System.out.println("i is " + i);
    }

    public static void main(String[] args) {
        Inter t = new Test11();
        t.f();
    }
}

interface Inter {

    int i = 1;

    void f();
}
