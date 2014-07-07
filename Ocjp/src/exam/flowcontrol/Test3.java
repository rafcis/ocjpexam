/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * oes not compile, line 32
 */
class MyException1 extends Exception {
}

class Test3 {

    void f() throws MyException1 {
        throw new MyException1();
    }

    public static void main(String[] args) throws MyException1 {
        MyException1 e1;
        Test3 t = new Test3();
        try {
            t.f();
        } catch (MyException1 e) {
            e1 = e;
            System.out.print("catch 1 ");
        } finally {
            try {
                throw e1;
            } catch (Exception e) {
                System.out.println("catch 2 ");
            }
        }
        System.out.println("end");
    }
}
