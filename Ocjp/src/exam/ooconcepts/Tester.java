/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.ooconcepts;

/**
 *
 * @author rafcis
 * Output: "good-bye" followed by "hello"
 */
class Tester {

    int var;

    Tester(double var) {
        this.var = (int) var;
    }

    Tester(int var) {
        this("hello");
    }

    Tester(String s) {
        this();
        System.out.println(s);
    }

    Tester() {
        System.out.println("good-bye");
    }

    public static void main(String[] args) {
        Tester t = new Tester(5);
    }
}
