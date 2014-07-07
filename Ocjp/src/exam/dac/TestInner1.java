/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "Inner"
 */
class TestInner1 {

    private static int i = 10;

    private static void f() {
        System.out.println(i);
    }

    TestInner1() {
        System.out.print("Outer");
    }

    static class MyInner {

        MyInner() {
            System.out.print("Inner");
        }

        void g() {
            f();
        }
    }

    public static void main(String[] args) {
        new TestInner1.MyInner();
    }
}
