package Classes_UI;

import javax.swing.JFrame;

/**
 * Está classe realiza a função de abrir uma janela para realizar as vendas
 * @author niloc
 */
public class AbrirVenda_F {
    
    private MenuVendas janelaVendas;
    
    /**
     * Método que abre o menu de vendas
     * @param vendedor usuário atual do programa
     */
    public void makeFrameVendas(String vendedor)
    {
        janelaVendas = new MenuVendas(vendedor);
        janelaVendas.setLocationRelativeTo(null);
        janelaVendas.setTitle("Abrir venda");
        janelaVendas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janelaVendas.setVisible(true);
    }
    
}
