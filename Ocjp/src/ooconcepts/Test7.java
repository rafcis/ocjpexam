/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Code does not compile, Test7 cannot be converted to SuperTest1, line 36
 */
class SuperTest1 {

    SuperTest1() throws Exception {
    }

    int f() {
        return 0;
    }
}

public class Test7 extends SuperTest {

    int i;

    int f() {
        return i;
    }

    Test7(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        SuperTest1 t = new Test7(5);
        System.out.println(t.f());
    }
}
