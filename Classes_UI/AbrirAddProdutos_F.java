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
public class AbrirAddProdutos_F {

  private AddProdutos janelaAddProdutos;

  /**
   * Método que abre o menu de vendas
   *
   * @param vendedor usuário atual do programa
   */
  public void makeFrameAddProdutos() {
    janelaAddProdutos = new AddProdutos();
    janelaAddProdutos.setLocationRelativeTo(null);
    janelaAddProdutos.setTitle("Adicionar Produto");
    janelaAddProdutos.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    janelaAddProdutos.setVisible(true);
  }
}
