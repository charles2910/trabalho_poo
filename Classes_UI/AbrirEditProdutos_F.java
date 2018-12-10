/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UI;

import javax.swing.JFrame;

/**
 * Está classe realiza a função de abrir uma janela para adicionar produtos
 *
 * @author charles
 */
public class AbrirEditProdutos_F {

  private EditProdutos janelaEditProdutos;

  /**
   * Método que abre o menu de vendas
   *
   * @param vendedor usuário atual do programa
   */
  public void makeFrameEditProdutos(GrcProdutos_P grcProd) {
    janelaEditProdutos = new EditProdutos(grcProd);
    janelaEditProdutos.setLocationRelativeTo(null);
    janelaEditProdutos.setTitle("Editar Produto");
    janelaEditProdutos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    janelaEditProdutos.setVisible(true);
  }
}
