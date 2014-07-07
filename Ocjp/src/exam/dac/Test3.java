/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "float4"
 */
class AAA {

    int i;

    AAA() {
    }
}

class BBB extends AAA {

    BBB(short i) {
        this.i = i;
        System.out.println("short");
    }

    BBB(float j) {
        i = (int) j;
        System.out.print("float");
    }
}

public class Test3 extends BBB {

    Test3() {
        super(4);
    }

    public static void main(String[] args) {
        System.out.print(new Test3().i); //line 1
    }
}
