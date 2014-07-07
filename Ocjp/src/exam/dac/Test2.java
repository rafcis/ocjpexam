/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał 
 * Does not compile, private constructor in AA
 */
class AA {

    int b = 10;

    private AA() {
        this.b = 7;
    }

    int f() {
        return b;
    }
}

class BB extends AA {

    int b;
}

public class Test2 {

    public static void main(String[] args) {
        AA a = new BB();
        System.out.println(a.f());
    }
}
