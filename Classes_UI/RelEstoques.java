package Classes_UI;

import javax.swing.JFrame;

/**
 *
 * @author gabac
 */
public class RelEstoques {
    private MenuRelatorios janelaRelEst;//= new MenuVendas("eaea");
    
    public void makeFramePrincipal()
    {
        janelaRelEst = new MenuRelatorios();
        janelaRelEst.setLocation(600,250);
        //janelaRel.setTitle("Abrir relatórios");
        janelaRelEst.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janelaRelEst.setVisible(true);
    }
    
}
