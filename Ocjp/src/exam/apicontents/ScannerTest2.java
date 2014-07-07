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
 * Prints apples oranges pears
 */
class ScannerTest2 {

    public static void main(String[] args) {
        String input = "10 apples 20 oranges 33 pears";
        Scanner s = new Scanner(input).useDelimiter("\\d\\d\\s");
        while (s.hasNext()) {
            System.out.print(s.next());
        }
        s.close();
    }
}
