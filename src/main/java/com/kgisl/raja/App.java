/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kgisl.raja;

import javax.swing.SwingUtilities;
import com.kgisl.raja.controller.AddressBookController;


/**
 *
 * @author Bharathy Annamalai KGiSL
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            
   

            @Override
            public void run() {
               
                AddressBookController controller=new AddressBookController();
                controller.control();
               
            }
        });
    }
}
