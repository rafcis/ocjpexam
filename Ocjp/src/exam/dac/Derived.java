/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Compiler error
 */
class Base {

    Base(int i) {
        System.out.println("Base");
    }
}

class Derived extends Base {

    public static void main(String[] args) {
        Derived d = new Derived();
    }

    void Derived() {
        System.out.println("Derived");
    }
}
