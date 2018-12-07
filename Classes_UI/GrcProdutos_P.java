package Classes_UI;

import Classes_Base.*;

/** @author Mateus */
public class GrcProdutos_P extends javax.swing.JPanel {

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

    jComboBox1 = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    tableData1 =
        new javax.swing.table.DefaultTableModel(
            new String[] {"Código", "Nome", "Quantidade", "Preço"}, 0);

    int size = Estoque.sizeOfEstoque();
    if (size > 0) {
      for (int i = 0; i < size; i++) {
        Object[] data = Estoque.buscarProduto(i).toData();
        data[0] = new Integer(i);
        tableData1.addRow(data);
      }
    }

    jComboBox1.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[] {"Item 1", "Item 2", "Item 3", "Item 4"}));

    jTable1.setModel(tableData1);

    jScrollPane1.setViewportView(jTable1);

    jButton1.setText("Cadastrar Produto (F1)");

    jButton2.setText("Editar Produto (F2)");

    jButton3.setText("Excluir Produto (F3)");

    jButton4.setText("Entrada no Estoque");

    jButton5.setText("Saída no Estoque");

    jButton6.setText("Menu");
    jButton6.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton6MouseClicked(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(
                                        jButton4,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(
                                        jButton5,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(
                                        jButton6,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        86,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jButton1,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(
                                                        jButton2,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(37, 37, 37)
                                                    .addComponent(
                                                        jButton3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        150,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(212, 212, 212))
                                            .addComponent(
                                                jScrollPane1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                733,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(33, Short.MAX_VALUE)))));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jButton1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                70,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                70,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton3,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                70,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        353,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                jButton4,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                70,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton5,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                70,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                jButton6,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                43,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  private void jButton6MouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jButton6MouseClicked
    janela.removeMenuGerencProdutos();
    janela.menuOPC();
  } // GEN-LAST:event_jButton6MouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.table.DefaultTableModel tableData1;
  // End of variables declaration//GEN-END:variables
}