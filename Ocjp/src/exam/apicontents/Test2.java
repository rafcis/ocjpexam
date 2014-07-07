/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * Prints "False"
 */
class Test2 {

    public static void main(String[] args) {
        Character c = 65; 		//line 1
        Character d = new Character('A');
        if (c > d) //line 3
        {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
