/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.apicontents;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author rafcis 
 * java Serialize3 S
 * java Serialize3 D
 * Prints 0
 */
class Serialize3 {

    public static void main(String[] args) throws Exception {
        String s = "D";
        if (s.equals("S")) {
            Test t = new Test();
            t.setI(8);
            ObjectOutputStream oos
                    = new ObjectOutputStream(
                            new FileOutputStream("f.tmp"));
            oos.writeObject(t);
            oos.close();
        } else if (s.equals("D")) {
            Test t = new Test();
            t.setI(8);
            ObjectInputStream ois
                    = new ObjectInputStream(
                            new FileInputStream("f.tmp"));
            t = (Test) ois.readObject();
            System.out.println(t.getI());
            ois.close();
        }
    }
}

class Test implements Serializable {

    transient int i = 4;

    Test() {
        i = 5;
    }

    void setI(int i) {
        this.i = i;
    }

    int getI() {
        return i;
    }
}
