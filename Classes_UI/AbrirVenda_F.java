/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UI;

import javax.swing.JFrame;

/**
 *
 * @author niloc
 */
public class AbrirVenda_F {
    
    private MenuVendas janelaVendas;//= new MenuVendas("eaea");
    
    public void makeFramePrincipal(String vendedor)
    {
        janelaVendas = new MenuVendas(vendedor);
        janelaVendas.setLocation(600,250);
        janelaVendas.setTitle("Abrir venda");
        janelaVendas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        janelaVendas.setVisible(true);
    }
    
}
