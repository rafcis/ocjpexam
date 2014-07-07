/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

/**
 *
 * @author rafcis
 * It prints "aaaa123a"
 */
class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("a");
        for (int i = 1; i < 5; i++) {
            result.append("a");
        }
        result.insert(4, "123");
        System.out.println(result);
    }
}
