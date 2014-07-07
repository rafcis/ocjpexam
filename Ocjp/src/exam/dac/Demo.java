/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "Name is null".
 */
public class Demo {

    private String userNames[];

    public Demo() {
        userNames = new String[10];
    }

    public void showName(int n) {
        System.out.println("Name is " + userNames[n]);
    }

    public String getName(int n) {
        return (userNames[n]);
    }
    
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.showName(0);
    }
}
