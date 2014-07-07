/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 */
public class MyClass {

    private static int x = getValue();
    private static int y = 5;

    private static int getValue() {
        return y;
    }

    public static void main(String[] args) {
        /**
         * Prints 0
         */
        System.out.println(x);
    }
}
