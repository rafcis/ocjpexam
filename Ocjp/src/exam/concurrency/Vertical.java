/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.concurrency;

/**
 *
 * @author rafcis
 * AssertionError may or may not be thrown by this code
 * Multiple threads may execute down() method simultaneously
 */
public class Vertical {

    private int alt;

    public synchronized void up() {
        ++alt;
    }

    public void down() {
        --alt;
    }

    public synchronized void jump() {
        int a = alt;
        up();
        down();
        assert (a == alt);
    }
}
