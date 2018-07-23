/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo Rico
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    //static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    public static void main(String args[]) {


        /* Create and display the form */
        try {
            System.out.println("OK");
            splash s = new splash();
            //device.setFullScreenWindow(s);
            s.setVisible(true);
            Thread.sleep(7000);
            s.dispose();
            
            
            login log1 = new login();
            log1.setLocationRelativeTo(null);
            log1.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(splash.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
