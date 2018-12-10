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
 * Está classe tem a função de gerenciar cada componente da interface gráfica da janela de adicionar
 * produtos,atribuindo as funcionalidades aos componentes como labels, textFields e botões.
 *
 * @author niloc
 */
public class AddProdutos extends JFrame {
  public AddProdutos(GrcProdutos_P grcProd) {
    this.gerenciador = grcProd;
    initComponents();
  }

  void initComponents() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    adicionar = new JPanel(new GridLayout(4, 2));

    campoNome = new JTextField(20);
    campoQtd = new JTextField(20);
    campoPreco = new JTextField(20);

    botaoAddOk = new JButton("Adicionar");
    botaoAddOk.addActionListener(new AddActionListener());
    botaoCancelar = new JButton("Cancelar");
    botaoCancelar.addActionListener(new CancelarActionListener());

    adicionar.add(new JLabel("  Nome do Produto: "));
    adicionar.add(campoNome);
    adicionar.add(new JLabel("  Quantidade: "));
    adicionar.add(campoQtd);
    adicionar.add(new JLabel("  Preço: "));
    adicionar.add(campoPreco);
    adicionar.add(botaoCancelar);
    adicionar.add(botaoAddOk);

    getContentPane().add(adicionar);

    pack();
  }

  class AddActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      try {
        if ((Integer.parseInt(campoQtd.getText()) < 0)
            || (Double.parseDouble(campoPreco.getText()) < 0)) {
          JOptionPane.showMessageDialog(getContentPane(), "Valores Inválidos.");
        } else {
          Estoque.adicionarProduto(
              campoNome.getText(),
              Integer.parseInt(campoQtd.getText()),
              Double.parseDouble(campoPreco.getText()));
          JOptionPane.showMessageDialog(getContentPane(), "Produto Adicionado.");
          setVisible(false);
          dispose();
          gerenciador.updateTable();
          Estoque.gravarEstoque();
        }
      } catch (NumberFormatException e1) {
        JOptionPane.showMessageDialog(getContentPane(), "Campos Numéricos com Formatação Errada.");
      }
    }
  }

  class CancelarActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      setVisible(false);
      dispose();
    }
  }

  private JPanel adicionar;
  private JTextField campoNome;
  private JTextField campoQtd;
  private JTextField campoPreco;
  private JButton botaoAddOk;
  private JButton botaoCancelar;
  private GrcProdutos_P gerenciador;
}
