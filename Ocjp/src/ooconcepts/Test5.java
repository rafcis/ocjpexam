/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * The code does not compile
 * reference to myMethod ambiguous
 */
public class Test5 {

    public void myMethod(String s) {
        System.out.println("My String");
    }

    public void myMethod(StringBuffer sb) {
        System.out.println("My StringBuffer");
    }

    public void myMethod(Object sb) {
        System.out.println("My Object");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.myMethod(null);
    }
}
