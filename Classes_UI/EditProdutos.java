/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UI;

import Classes_Base.*;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 * Está classe tem a função de gerenciar cada componente da interface gráfica da janela de editar
 * produtos,atribuindo as funcionalidades aos componentes como labels, textFields e botões.
 *
 * @author niloc
 */
public class EditProdutos extends JFrame {
  public EditProdutos(GrcProdutos_P grcProd) {
    this.gerenciador = grcProd;
    initComponents();
  }

  void initComponents() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    editar = new JPanel(new GridLayout(6, 2));

    campoPesquisa = new JTextField(10);
    campoNome = new JTextField(20);
    campoQtd = new JTextField(20);
    campoPreco = new JTextField(20);

    botaoBuscar = new JButton("Buscar");
    botaoBuscar.addActionListener(new BuscarActionListener());

    botaoOk = new JButton("Ok");
    botaoOk.addActionListener(new OkActionListener());
    botaoCancelar = new JButton("Cancelar");
    botaoCancelar.addActionListener(new CancelarActionListener());

    editar.add(new JLabel("  Nome do Produto a Pesquisar: "));
    editar.add(campoPesquisa);
    editar.add(botaoCancelar);
    editar.add(botaoBuscar);
    editar.add(new JLabel("  Nome: "));
    editar.add(campoNome);
    editar.add(new JLabel("  Quantidade: "));
    editar.add(campoQtd);
    editar.add(new JLabel("  Preço: "));
    editar.add(campoPreco);

    editar.add(botaoOk);

    getContentPane().add(editar);

    pack();
  }

  class BuscarActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      Produto p = Estoque.buscarProduto(campoPesquisa.getText());
      if (p == null) JOptionPane.showMessageDialog(getContentPane(), "Produto Não Encontrado.");
      else {
        campoNome.setText(p.getNome());
        campoQtd.setText(Integer.valueOf(p.getQuantidade()).toString());
        campoPreco.setText(Double.valueOf(p.getPreco()).toString());
      }
    }
  }

  class OkActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      Produto p = Estoque.buscarProduto(campoPesquisa.getText());
      p.setNome(campoNome.getText());
      p.setQuantidade(Integer.parseInt(campoQtd.getText()));
      p.setPreco(Double.parseDouble(campoPreco.getText()));
      JOptionPane.showMessageDialog(getContentPane(), "Produto Adicionado.");
      setVisible(false);
      dispose();
      gerenciador.updateTable();
    }
  }

  class CancelarActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      setVisible(false);
      dispose();
    }
  }

  private JPanel editar;
  private JTextField campoPesquisa;
  private JTextField campoNome;
  private JTextField campoQtd;
  private JTextField campoPreco;
  private JButton botaoBuscar;
  private JButton botaoOk;
  private JButton botaoCancelar;
  private GrcProdutos_P gerenciador;
}
