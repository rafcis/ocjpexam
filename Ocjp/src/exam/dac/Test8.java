/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * nothing print
 */
public class Test8 {

    public abstract class InnerTest {

        abstract void f();
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        Test8.InnerTest test = t.new InnerTest() {
            public void f() {
                System.out.println("Inner f");
            }
        };
    }
}
