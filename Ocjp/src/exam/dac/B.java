/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * This code causes compile-time error
 */
class A {

    int increment(int x) {
        return x + 10;
    }

    long increment(int x) {
        return x + 20;
    }
}

class B extends A {

    public static void main(String[] args) {
        B b = new B();
        int y = b.increment(12);
    }
}
