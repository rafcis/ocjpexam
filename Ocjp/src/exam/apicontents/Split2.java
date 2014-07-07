/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

import java.util.Arrays;

/**
 *
 * @author rafcis
 * Prints [She, sells, sea, shells]
 */
public class Split2 {

    public static void main(String[] args) {
        String str = "She sells sea shells";
        System.out.println(Arrays.toString(str.split("\\s")));
    }
}
