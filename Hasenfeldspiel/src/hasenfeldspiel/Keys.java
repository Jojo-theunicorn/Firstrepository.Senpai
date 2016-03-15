/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasenfeldspiel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author sergio.angione
 */
public class Keys implements KeyListener{
    
    public boolean[] keys;
    
    public Keys(){
        keys = new boolean[256];
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()] = true;
        System.out.println("Hallo");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()] = false;
    }
}
