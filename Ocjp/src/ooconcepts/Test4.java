/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Code does not compile, a method with default access cannot be overriden as protected
 */
class SuperTest {

    int f() {
        return 0;
    }
}

public class Test4 extends SuperTest {

    int i;

    protected int f() throws Error {
        return i;
    }

    Test4(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        SuperTest t = new Test4(5);
        System.out.println(t.f());
    }
}
