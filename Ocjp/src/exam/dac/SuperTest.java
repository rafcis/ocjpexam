/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * ??? replace with C or V
 */
interface XX {
}

class ZZ {
}

class X extends ZZ implements XX {
}

class V extends X {
}

class C extends V {
}

class SuperTest {

    public X callMe() {
        return new X();
    }
}

class Test5 extends SuperTest {

    public ??? callMe() {
        return new C();
    }
}
