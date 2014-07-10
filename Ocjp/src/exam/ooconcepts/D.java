/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.ooconcepts;

/**
 *
 * @author rafcis
 * Output: Prints "Inside C Inside B Inside A"
 */
class AZ {

    static void f() {
        System.out.print("Inside A ");
    }
}

class BZ extends AZ {

    static void f() {
        System.out.print("Inside B ");
    }
}

class CZ extends BZ {

    static void f() {
        System.out.print("Inside C ");
    }
}

class D {

    public static void main(String[] args) {
        CZ c = new CZ();
        c.f();
        BZ b = c;
        b.f();
        AZ a = (BZ) c;
        a.f();
    }
}
