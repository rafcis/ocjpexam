/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * cannot find symbol e
 */
class Test1 {

    void f() {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        Test1 t = new Test1();
        try {
            t.f();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
            throw e;
        }
    }
}
