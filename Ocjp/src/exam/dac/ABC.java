/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * arr1 is initialized to null
 * arr3.length==0
 * arr2[0]==0
 */
public class ABC {

    static int[] arr1;
    int[] arr2 = new int[10];
    static float[] arr3 = {};

    void f() {
        double[] arr4;
    }
    
    public static void main(String[] args) {
        ABC abc = new ABC();
        System.out.println(abc.arr2.length);
    }
}
