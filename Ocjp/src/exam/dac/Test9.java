/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * The program will compile correctly if line 4 is removed
 */
class Test9 {

    final Object obj;

    Test9() {
        obj = null; // 1
        System.out.println(obj instanceof Object); //2
        Integer i = new Integer("1"); //3
        obj = i;    //4
    }

    public static void main(String[] args) {
        Test9 test = new Test9();
        System.out.println(test.obj);
    }
}
