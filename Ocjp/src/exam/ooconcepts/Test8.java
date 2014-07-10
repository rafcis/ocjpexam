/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam.ooconcepts;

/**
 *
 * @author rafcis
 * Compiler error at line 2
 */
class SuperBase{}
    class Base2 extends SuperBase{}
    class Derived1 extends Base2{}
    public class Test8 {
        public static void main(String[] args) {
            SuperBase[] s1 = new Base2[2];		//1
            SuperBase[] s2 = new Derived1[1]{new Derived1()};		//2
            Base2[] b1 = new Derived1[0];			//3
            Derived1[] d1 = (Derived1[])s2;		//4
            Base2[] b3 = d1;						//5	
            s1 = b1;							//6
        }
}
