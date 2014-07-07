/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * The program will terminate with an ArrayIndexOutOfBoundsException
 */
public class StringArr {

    String[][][] arr = {
        {{}, null},
        {{"1", "2"}, {"1", null, "3"}},
        {},
        {{"1", null}}
    };

    public static void main(String[] args) {
        StringArr s = new StringArr();
        System.out.println(s.arr.length + s.arr[1][2].length);
    }
}
