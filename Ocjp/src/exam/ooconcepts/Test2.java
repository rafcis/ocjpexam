/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.ooconcepts;

/**
 *
 * @author rafcis
 * The code fails to compile. The compiler complains about duplicated methods
 * Changing the code at line 24 to "public void print(int x){" will allow the code to compile correctly
 */
public class Test2 {

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("Test");
    }

    public void print() {
        System.out.println("Another Test");
    }
}
