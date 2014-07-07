/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Exception - myMethod is not static
 */
class MyBoolean {

    Boolean bool[] = new Boolean[5];

    public static void main(String[] args) {
        new MyBoolean().myMethod();
    }

    public void myMethod() {
        if (bool[1] == true) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
    }
}
