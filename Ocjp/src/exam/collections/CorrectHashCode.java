/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

/**
 *
 * @author rafcis
 */
public class CorrectHashCode {

    private int number;
    transient int data;

    public CorrectHashCode(int i) {
        number = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(this.getClass())) {
            return (number == ((CorrectHashCode) obj).number);
        }
        return false;
    }

    // which implementation of hashCode should be inserted here
    public int hashCode() {
        Integer num = new Integer(number);
        return num.hashCode();
    }

    public int hashCode() {
        return number;
    }
}
