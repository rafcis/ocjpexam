/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "myMethod"
 */
public final class Test6 {

    class Inner {

        void test6() {
            if (Test6.this.bool);
            {
                myMethod();
            }
        }
    }
    private boolean bool = false;

    public void myMethod() {
        System.out.println("myMethod");
    }

    public Test6() {
        (new Inner()).test6();
    }

    public static void main(String[] args) {
        new Test6();
    }
}
