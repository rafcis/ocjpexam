/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "A" followed by 0
 */
abstract class AbstractTest {

    static int i;

    abstract Object test();

    AbstractTest() {
        System.out.println("A");
    }
}

class Test10 extends AbstractTest {

    Integer test() {
        return i;
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        System.out.println(t.test());
    }
}
