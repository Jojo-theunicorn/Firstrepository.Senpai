/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasenfeldspiel;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import frameapi.FrameAPI;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 *
 * @author sergio.angione
 */
public class Hasenfeldspiel implements KeyListener {
    
    
    private static Keys k;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        k = new Keys();
        addKeyListener(k);
        
        
     String[][] Spielfeld = new String[14][14];
        for (String[] Spielfeld1 : Spielfeld) {
            for (int t = 0; t<Spielfeld.length; t++) {
                Spielfeld1[t] = ".";
               
            }
        }
        Spielfeld[3][5]="H";
        Spielfeld[5][5]="H";
        Spielfeld[12][8]="H";
        Spielfeld[9][3]="H";
        Spielfeld[7][9]="H";
        Spielfeld[13][3]="F";
        Spielfeld[13][6]="F";
        Spielfeld[1][7]="H";
                Spielfeld[8][10]="H";
                Spielfeld[8][8]="H";
                Spielfeld[13][5]="H";
                Spielfeld[7][5]="H";
                Spielfeld[13][8]="F";
                 Spielfeld[13][13]="F";
        FrameAPI.initFrame();
        FrameAPI.initString(Spielfeld.length, Spielfeld);
        FrameAPI.setPlayground();
        
        do{
            if(FrameAPI.newRound){
                
                moveHasen();
                FrameAPI.initString(Spielfeld.length, Spielfeld);
                FrameAPI.setPlayground();
            }
        } while(!FrameAPI.allDead);
        
    }

    private static void moveHasen() {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        if(k.keys[ke.getKeyCode()] == true){
           System.out.println("Hallo"); 
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }


}