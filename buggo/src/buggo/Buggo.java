/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buggo;

import java.awt.Color;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

/**
 *
 * @author katek
 */
public class Buggo {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int k=500;
        int y=500;
        int p=255;
        for(int c=0;c<30;c++){
            JFrame j= new JFrame("jjkfvfdkg");
            j.setVisible(true);
            j.setSize(k,y);
            k-=10;
            y-=10;
            j.setBackground(Color.BLACK);
            p-=10;
            TimeUnit.MILLISECONDS.sleep(100);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }   
}
