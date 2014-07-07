/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.flowcontrol;

/**
 *
 * @author Rafał
 * public void methodA(int i)
 */
public class AssertTest3 {

    public void methodA(int i) throws AssertionError {
        assert i < 1024 : "Invalid Value";
    }
}

class At extends AssertTest3 {
    
    public void methodA(int i){
        
    }
}
