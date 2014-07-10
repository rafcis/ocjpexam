/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Does not compile, line 25, call to super must be first statement in constructor
 */
class A {

    A() {
        System.out.println("A");

    }
}

class BB extends A {

    BB() {
        this(4);
        super();
        System.out.println("B");
    }

    BB(int i) {
        System.out.println("C");
    }
}
