/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasevsfüchse;

import frameapi.FrameAPI;
import java.util.Scanner;

/**
 *
 * @author der.pole
 */ 
public class HasevsFüchse {
   
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] Spielfeld = new String[14][14];
        for(int i=0; i<Spielfeld.length; i++) {
            for(int t=0; t<Spielfeld.length; t++) {
                Spielfeld[i][t]=".";
                //System.out.print(Spielfeld[i][t] + " ");
            }
        }
        Spielfeld[3][5]="H";
        Spielfeld[5][5]="H";
        Spielfeld[12][8]="H";
        Spielfeld[9][3]="H";
        Spielfeld[7][9]="H";
        Spielfeld[2][2]="F";
        Spielfeld[13][13]="F";
        
        FrameAPI.initFrame();
        FrameAPI.initString(Spielfeld.length, Spielfeld);
        FrameAPI.setPlayground();
        
        do{
            if(FrameAPI.newRound){
                Spielfeld[1][7]="H";
                Spielfeld[8][10]="H";
                Spielfeld[8][8]="H";
                Spielfeld[13][5]="H";
                Spielfeld[7][5]="H";
                Spielfeld[3][9]="F";
                moveHasen();
                FrameAPI.initString(Spielfeld.length, Spielfeld);
                FrameAPI.setPlayground();
            }
        } while(!FrameAPI.allDead);
        
    }

    private static void moveHasen() {
        
    }


}
    


    

