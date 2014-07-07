/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author rafcis
 * Prints 4455
 */
public class TestNumberFormat {

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        try {
            Number number = numberFormat.parse("4,455.67");
            System.out.println(number.intValue());
        } catch (java.text.ParseException ex) {
            System.out.println("Error");
        }
    }
}
