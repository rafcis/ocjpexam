/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * Compilatiorn error at line 7
 */
public class AssertTest {

    int LOCAL_RATE = 12;

    private void computeAmount(int rate) {
        assert rate = LOCAL_RATE : "Invalid rate";
        int amount = 10000;
        int total = amount + (amount * rate / 100);
        System.out.println("Total = " + total);
    }

    public static void main(String[] args) {
        AssertTest test = new AssertTest();
        test.computeAmount(12);
    }
}
