/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * output: one two default
 * 66 in ASCII is B
 */
public class Base {

    private void test() {
        int i = 66;
        switch (i) {
            case 'A':
                System.out.println("zero");
                break;
            case 'B':
                System.out.println("one");
            case 'C':
                System.out.println("two");
            default:
                System.out.println("default");
        }
    }

    public static void main(String[] args) {
        {
            new Base().test();
        }
    }
}
