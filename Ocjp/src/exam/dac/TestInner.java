/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Compilation fails at line 3
 */
class TestInner {

    int i = 10; //1

    TestInner() {
        System.out.print("Outer");   //2
    }

    static class MyInner {

        MyInner() {
            System.out.println(i);    //3
        }
    }

    public static void main(String[] args) {  // 4
        new TestInner.MyInner();   //5
    }
}
