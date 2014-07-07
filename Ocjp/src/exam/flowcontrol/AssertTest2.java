/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * It will result in AssertionError with the message - "The value must not be negative"
 */
public class AssertTest2 {

    private void methodA(int i) {
        assert i >= 0 : methodB();
        System.out.println(i);
    }

    private String methodB() {
        return "The value must not be negative";
    }

    public static void main(String[] args) {
        AssertTest2 test = new AssertTest2();
        test.methodA(-10);
    }
}
