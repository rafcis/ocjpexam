/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * String cannot be converted to java.lang.StringBuffer
 */
public class Test3 {

    public static void main(String[] args) {
        StringBuffer s = "hello"; //1.
        String s1 = null; //2.
        s.append(s1); //3.
        System.out.println(s); //4.
    }
}
