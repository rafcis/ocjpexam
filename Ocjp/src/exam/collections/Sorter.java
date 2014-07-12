/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rafcis
 * Output: 1
 */
public class Sorter {

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("USA");
        aList.add("Russia");
        aList.add("UK");
        int pos = Collections.binarySearch(aList, "Russia");
        System.out.println(pos);
    }
}
