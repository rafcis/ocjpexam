/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Does not compile because test(Integer[]) cannot be applied to test(int?)
 */
class Vararg2 {

    public static void main(String[] args) {
        Integer i[] = {2, 3, 4};
        test(i);
        test();
    }

    public static void test(int... s) {
        for (int i : s) {
            System.out.printf("%d \n", i);
        }
    }
}
