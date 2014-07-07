/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

import java.io.*;

/**
 *
 * @author Rafał
 * ??
 * public void amethod(int i) throws FileNotFoundException {}
 * public void amethod(int i) throws IOException, RuntimeException {}
 * public void amethod(int i) throws RuntimeException {}
 * public void amethod(int i) throws Throwable {}
 */
class Parent {

    public void amethod(int i) throws IOException {
//         ?
    }
}

public class Child extends Parent {

    //??
}
