/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints 30, 30, 30
 */
public class MyClass1 {

    static int x;

    public static void main(String[] args) {
        x = 5;
        MyClass1 m1 = new MyClass1();
        MyClass1 m2 = new MyClass1();
        MyClass1 m3 = new MyClass1();
        m1.x = 10;
        m2.x = 20;
        m3.x = 30;
        System.out.println(m1.x);
        System.out.println(m2.x);
        System.out.println(m3.x);
    }
}
