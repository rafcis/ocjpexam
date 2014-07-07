/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * Prints "true"
 */
public class BoolTest {

    public static void main(String[] args) {
        Boolean b = new Boolean("TRue");	 //3.
        Boolean c = new Boolean("Null"); //4.
        boolean d = true; //5.
        Boolean e = (b || c) && d; //6.
        System.out.println(e); //7.
    }
}
