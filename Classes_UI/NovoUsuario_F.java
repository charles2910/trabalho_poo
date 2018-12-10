package Classes_UI;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mateus 9266410
 */

public class NovoUsuario_F extends JFrame{
    JPanel painel;
    
    
    public NovoUsuario_F(UIGovernor_F masterFrame, boolean forceADM, JFrame framePai){
        painel = new Novo_Usuário_P(masterFrame, forceADM);
        add(painel);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
        
    }

   
}