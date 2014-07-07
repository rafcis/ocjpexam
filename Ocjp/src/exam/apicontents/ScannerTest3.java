/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

import java.util.Scanner;

/**
 *
 * @author rafcis
 * Exception thrown at runtime
 */
public class ScannerTest3 {

    public static void main(String[] args) {
        String input = "10 apples 20 oranges 33 pears";
        Scanner s = new Scanner(input).useDelimiter("\\d*");
        String str[] = new String[6];
        int i = 0;
        while (s.hasNext()) {
            str[i] = s.next();
            System.out.println(str[i++]);
        }
        s.close();
    }
}
