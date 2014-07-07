/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * Does not compile, line 34
 */
class MyException extends Exception {
}

class Test2 {

    void f() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) throws MyException {
        MyException e1 = null;
        Test2 t = new Test2();
        try {
            t.f();
        } catch (MyException e) {
            e1 = e;
            System.out.println("catch");
        } finally {
            System.out.print("finally");
            throw e1;
        }
        System.out.println("end");
    }
}
