package Classes_UI;

import javax.swing.JFrame;

/**
 *
 * @author niloc
 */
public class AbrirRelatorio_F {
    
    private MenuRelatorios janelaRel;//= new MenuVendas("eaea");
    
    public void makeFramePrincipal()
    {
        janelaRel = new MenuRelatorios();
        janelaRel.setLocation(600,250);
        janelaRel.setTitle("Abrir relatórios");
        janelaRel.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janelaRel.setVisible(true);
    }
    
}
