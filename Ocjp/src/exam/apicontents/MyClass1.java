/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * Prints "falsefalsefalse"
 */
public class MyClass1 {

    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("hello"); //1.
        StringBuffer s2 = new StringBuffer("hello"); //2.
        Float f1 = 9.0F; //3.
        Double f2 = 9.0; //4.
        System.out.println(f1.equals(f2)); //5.
        System.out.println(s1 == s2); //6.
        System.out.println(s1.equals(s2)); //7.
    }
}
