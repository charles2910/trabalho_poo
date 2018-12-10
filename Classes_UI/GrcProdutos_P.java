package Classes_UI;

import Classes_Base.*;
import javax.swing.*;

/** @author Mateus */
public class GrcProdutos_P extends JPanel {

  /** Creates new form MenuGestãoProdutos */
  UIGovernor_F janela;

  public GrcProdutos_P(UIGovernor_F janela) {
    this.janela = janela;
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    // this.framePrincipal = janela.getFrame();
    jComboBox1 = new JComboBox<>();
    jScrollPane1 = new JScrollPane();
    jTable1 = new javax.swing.JTable();
    botaoAdd = new JButton();
    botaoEdit = new JButton();
    jButton5 = new JButton();
    jButton6 = new JButton();
    tableData1 =
        new javax.swing.table.DefaultTableModel(
            new String[] {"Código", "Nome", "Quantidade", "Preço"}, 0);

    int size = Estoque.sizeOfEstoque();
    if (size > 0) {
      for (int i = 0; i < size; i++) {
        Produto p = Estoque.buscarProduto(i);
        if (p != null) {
          Object[] data = p.toData();
          data[0] = new Integer(i);
          tableData1.addRow(data);
        }
      }
    }

    jComboBox1.setModel(
        new DefaultComboBoxModel<>(new String[] {"Item 1", "Item 2", "Item 3", "Item 4"}));

    jTable1.setModel(tableData1);

    jScrollPane1.setViewportView(jTable1);

    botaoAdd.setText("Cadastrar Produto");
    botaoAdd.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            botaoAddClicked(evt);
          }
        });

    botaoEdit.setText("Editar Produto");
    botaoEdit.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            botaoEditClicked(evt);
          }
        });

    jButton6.setText("Menu");
    jButton6.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton6MouseClicked(evt);
          }
        });

    GroupLayout layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addPreferredGap(
                                        LayoutStyle.ComponentPlacement.RELATED,
                                        GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(
                                        jButton6,
                                        GroupLayout.PREFERRED_SIZE,
                                        86,
                                        GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        botaoAdd,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        150,
                                                        GroupLayout.PREFERRED_SIZE)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(
                                                        botaoEdit,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        150,
                                                        GroupLayout.PREFERRED_SIZE))
                                            .addComponent(
                                                jScrollPane1,
                                                GroupLayout.PREFERRED_SIZE,
                                                733,
                                                GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(33, Short.MAX_VALUE)))));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                botaoAdd,
                                GroupLayout.PREFERRED_SIZE,
                                70,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                botaoEdit,
                                GroupLayout.PREFERRED_SIZE,
                                70,
                                GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(
                        jScrollPane1, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jButton6,
                                GroupLayout.PREFERRED_SIZE,
                                43,
                                GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  private void botaoAddClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jButton6MouseClicked
    new AbrirAddProdutos_F().makeFrameAddProdutos(this);
  }

  private void botaoEditClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jButton6MouseClicked
    new AbrirEditProdutos_F().makeFrameEditProdutos(this);
  }

  public void updateTable() {
    tableData1 =
        new javax.swing.table.DefaultTableModel(
            new String[] {"Código", "Nome", "Quantidade", "Preço"}, 0);

    int size = Estoque.sizeOfEstoque();
    if (size > 0) {
      for (int i = 0; i < size; i++) {
        Produto p = Estoque.buscarProduto(i);
        if (p != null) {
          Object[] data = p.toData();
          data[0] = new Integer(i);
          tableData1.addRow(data);
        }
      }
    }
    jTable1.setModel(tableData1);
  }

  private void jButton6MouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jButton6MouseClicked
    Estoque.gravarEstoque();
    janela.removeMenuGerencProdutos();
    janela.menuOPC();
  } // GEN-LAST:event_jButton6MouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private JFrame framePrincipal;
  private JButton botaoAdd;
  private JButton botaoEdit;
  private JButton jButton5;
  private JButton jButton6;
  private JComboBox<String> jComboBox1;
  private JScrollPane jScrollPane1;
  private JTable jTable1;
  private javax.swing.table.DefaultTableModel tableData1;
  // End of variables declaration//GEN-END:variables
}
