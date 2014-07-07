/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * error: method length() not exist
 */
class Test7 {

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4, 5};
        float[] j = new float[5];
        for (int k = 0; k < j.length(); k++) {
            i[k] = (char) j[k];
            System.out.println(i[k]);
        }
    }
}
