/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Compiler error, line 23
 */
class A {

    Integer print() {
        System.out.println("A");
        return 0;
    }
}

class B extends A {

    int print() {
        super.print();
        System.out.println("B");
        return 0;
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.print();
    }
}
