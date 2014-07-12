/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

import java.util.*;

/**
 *
 * @author rafcis 
 * Compiler error, incompatible types: Object[] cannot be converted to String[], Line 23
 */
class Collection1 {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("apple");
        s.add("Apple");
        s.add("1");
        s.add("1.0");
        String[] ss = s.toArray();
        for (String str : ss) {
            System.out.println(str);
        }
    }
}
