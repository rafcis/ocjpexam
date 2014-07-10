/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Prints "Object"
 */
class Test3 {

    static Object test = "hello";

    void f(Object x) {
        System.out.println("Object");
    }

    void f(String x) {
        System.out.println("String");
    }

    void f(StringBuffer x) {
        System.out.println("StringBuffer");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.f(test);
    }
}
