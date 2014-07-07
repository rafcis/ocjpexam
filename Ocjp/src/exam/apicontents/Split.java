/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * Prints 4
 */
public class Split {

    public static void main(String[] args) {
        String str = "aaaaaaaaabb";
        String[] s = str.split("a{3}");
        System.out.println(s.length);
        for(String a : s){
            System.out.println("-" + a);
        }
    }

}
