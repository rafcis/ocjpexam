/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rafcis
 * The code will compile if List<?> is replaced by List<Object>
 */
class Generics17 {

    public static void main(String[] args) {
        List<Object> list = new LinkedList<Object>();
        list.add("A");
        addToList("B", list);
        System.out.println(list);
    }

    static void addToList(Object o, List<?> I) {
        I.add(o);
    }
}
