/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "Are equal" twice
 */
enum Fish {

    GOLDFISH, ANGELFISH, GUPPY;
}

public class EnumTest2 {

    public static void main(String[] args) {
        Fish f = Fish.valueOf("GUPPY");
        if (f == Fish.GUPPY) {
            System.out.println("Are equal");
        }
        if (f.equals(Fish.GUPPY)) {
            System.out.println("Are equal");
        }
    }
}
