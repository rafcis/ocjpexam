/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * It will print - Assertions are disabled
 */
public class AssertDemo {

    public static void main(String[] args) {
        boolean assertEnabled = false;

        assert assertEnabled = true;

        System.out.println("Assertions are "
                + (assertEnabled ? "enabled" : "disabled"));
    }
}
