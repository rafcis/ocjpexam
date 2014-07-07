/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "sub
 */
interface Inter1 {
}

class First implements Inter1 {

    public Inter1 method1() {
        System.out.println("super");
        return new First();
    }
}

class Second extends First {

    public First method1() {
        System.out.println("sub");
        return new Second();
    }
}

public class CovariantTest2 {

    public static void main(String[] args) {
        First first = new Second();
        Inter1 first1 = first.method1();
    }
}
