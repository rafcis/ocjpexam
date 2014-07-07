/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Code does not compile
 */
public class Test12 {

    void f() {
        System.out.println("Outer");
    }

    public class InnerTest {

        InnerTest() {
            System.out.println("Inner constructor");
        }

        void f() {
            System.out.println("Inner f");
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        Test12.InnerTest test = t.new InnerTest() {
            public void f() {
                t.f();
                System.out.println("Sub Inner f");
            }
        };
        test.f();
    }
}
