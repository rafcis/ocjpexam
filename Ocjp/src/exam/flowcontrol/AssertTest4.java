/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * It will print - "f3 = NaN"
 */
public class AssertTest4 {

    public static void main(String[] args) {
        float f1 = Float.NaN;
        float f2 = f1;
        float f3 = 2f;

        try {
            assert (f2 == f1) : f2 = 2;
            f3 = 5f;
        } catch (AssertionError ae) {
            f3++;
        }

        f3 += f2;
        System.out.println("f3 = " + f3);
    }

}
