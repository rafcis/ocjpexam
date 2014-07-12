/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.collections;

/**
 *
 * @author rafcis It will print - false
 */
public final class EqualsDemo {

    private String str;

    public EqualsDemo(String s) {
        str = s;
    }

    public boolean equals(EqualsDemo obj) {
        if (!(obj instanceof EqualsDemo)) {
            return false;
        }
        EqualsDemo ed = (EqualsDemo) obj;
        return (str == ed.str || (str != null && str.equals(ed.str)));
    }

    public static void main(String[] args) {
        EqualsDemo demo1 = new EqualsDemo("Java");
        EqualsDemo demo2 = new EqualsDemo("java");
        System.out.println(demo1.equals(demo2));
    }
}
