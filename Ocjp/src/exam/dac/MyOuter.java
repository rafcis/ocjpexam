/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * incompatible types, possible lossy conversion from double to float
 */
class MyOuter {

    private class MyInner {

        float f() {
            return 1.2;
        }
    }

    MyInner getInner() {
        return new MyInner();
    }
}

class Test4 {

    public static void main(String[] args) {
        MyOuter outer = new MyOuter();
        System.out.println(outer.getInner.f());
    }
}
