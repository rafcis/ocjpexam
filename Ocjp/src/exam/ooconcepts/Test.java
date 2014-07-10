/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.ooconcepts;

/**
 *
 * @author rafcis
 * ClassCastException at runtime
 * Base cannot be cast to Derived,  line 30
 */
interface Inter {
}

class Base implements Inter {
}

class Derived extends Base {
}

public class Test {

    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        Inter i = (Base) b;			//1
        i = (Base) d;				//2
        Derived bd = (Derived) b;	//3
        b = (Base) i;				//4
    }
}
