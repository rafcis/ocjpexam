/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * 1 true
 * 2 true
 * 3 false
 * 4 true
 */
public class MyClass {

    static String s1 = "I am unique!";

    public static void main(String[] args) {
        String s2 = "I am unique!";
        String s3 = new String(s1);
        System.out.println(s1 == s2); //1
        System.out.println(s1.equals(s2)); //2
        System.out.println(s3 == s1); //3
        System.out.println(s3.equals(s1)); //4
    }
}
