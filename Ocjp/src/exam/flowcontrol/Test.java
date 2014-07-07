/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał 
 * Compilation error
 */
class Test {

    String f(int i) {
        switch (i) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "C";
            default:
                assert false;
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        for (int i = 0; i < 4; i++) {
            System.out.println(t.f(i));
        }
    }
}
