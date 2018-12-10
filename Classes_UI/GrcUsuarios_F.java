package Classes_UI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Mateus 9266410
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

