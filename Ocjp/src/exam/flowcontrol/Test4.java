/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * Compiler error on line 4
 */
public class Test4 {

    public static void main(String[] args) {
        float i = 0;
        final byte j = 5;
        final short s = 4;
        while (i < 5) {
            switch ((int) i + 2) {	//1
                default:			// 2
                case j:
                    System.out.println("one");	//3
                case s + 1: // 4
                {
                    System.out.println("two");
                    break;
                }
            }
            i++;
        }
    }
}
