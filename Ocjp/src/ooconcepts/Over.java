/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooconcepts;

/**
 *
 * @author rafcis
 * Compiler error, aMethod(int) has private access in Base1, line 25
 */
class Base1 {

    private void aMethod(int iBase) {
        System.out.println("Base");
    }
}

class Over extends Base1 {

    public static void main(String[] argv) {
        Base1 o = new Over();
        int iBase = 0;
        o.aMethod(iBase);
    }

    public void aMethod(int iOver) {
        System.out.println("Over");
    }
}
