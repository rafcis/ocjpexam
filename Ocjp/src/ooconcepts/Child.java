/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Prints "In Child 20" followed by "Child data 10"<
 */
class Parent {

    static int i = 10;

    void m1() {
        System.out.println("In parent " + i);
    }

    static void m1(String s) {
        System.out.println(s = i);
    }
}

class Child extends Parent {

    static int i = 20;

    void m1() {
        System.out.println("In child " + Child.i);
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        System.out.println("Child data " + p.i);
    }
}
