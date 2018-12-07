/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Mateus
 */
public class GrcUsuarios_F extends JFrame {
   
    UIGovernor_F UImaster;
    GrcUsuarios_P panel;
    
    public GrcUsuarios_F(UIGovernor_F UImaster){
        this.UImaster = UImaster;
        
        panel = new GrcUsuarios_P(UImaster);
        add(panel);
        setLocationRelativeTo(UImaster);
        setResizable(false);
        pack();
        UImaster.setEnabled(false);
        this.setVisible(true);
    }
}

