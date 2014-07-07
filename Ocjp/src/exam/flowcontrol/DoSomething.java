/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 */
public class DoSomething {

    void doSomething(int i) {
        int a = i % 3;
        if (a == 1) {
            // some action for a=1
            System.out.println("some action for a=1");
        } else if (a == 2) {
            // some action for a=2
            System.out.println("some action for a=2");
        } else {
            assert a == 0 : a;
            // some action for a=0
            System.out.println("some action for a=0");
            System.out.println(a);
        }
    }
    
    public static void main(String[] args) {
        DoSomething ds = new DoSomething();
        ds.doSomething(3);
    }
}
