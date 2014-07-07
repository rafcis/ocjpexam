/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * The code runs and writes "null" in the standard output
 */
public class Mystery {

    String s;

    public static void main(String[] args) {
        Mystery m = new Mystery();
        m.go();
    }

    void Mystery() {
        s = "Constructor";
    }

    void go() {
        System.out.println(s);
    }
}
