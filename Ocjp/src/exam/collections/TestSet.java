/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author rafcis
 * Prints "JSP Java Swing XML"
 */
public class TestSet {

    public static void main(String[] args) {
        Collection<String> set = new TreeSet<String>();
        set.add("Java");
        set.add("XML");
        set.add("Swing");
        set.add("JSP");
        set.add("Java");
        for (Object o : set) {
            System.out.print(o + " ");
        }
    }
}
