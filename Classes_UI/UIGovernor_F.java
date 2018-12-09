package Classes_UI;

import Classes_Base.Usuário;
import Classes_Base.Usuários;
import javax.swing.*;

/**
 * Classe Principal que comandará a raíz da interface gráfica. Ela contém também todos os recursos
 * necessários para os elementos da UI Rodarem, como a base de usuários, que se chamará UserBase, O
 * usuário Atualmente logado, "CurrentUser", dentre outros. Sua instanciação sempre Será referida
 * pelo nome "UImaster" por todos os elementos da interface.
 *
 * @author Mateus 9266410,
 */
public class UIGovernor_F extends JFrame {
  protected JFrame framePrincipal;
  protected Login_P menulogin;
  protected Menu_P menuPrincipal;
  protected GrcProdutos_P menuprod;
  protected JFrame primeiroCadastroFrame;
  protected GrcUsuarios_P menuUser;

  Usuários UserBase;
  Usuário CurrentUser;

  private static void Saudação() {
    // Saudação inicial do programa, informando os membros do grupo e o propósito do trabalho
    JOptionPane.showMessageDialog(
        null,
        "Este é o trabalho de POO de controle de estoque de um Pet-Shop  \n\n"
            + "Equipe:\nMateus Medeiros 9266410\n"
            + "Nome nusp\n"
            + "Nome nusp\n"
            + "Nome nusp\n\n"
            + "SCC0604 - Programação Orientada a Objetos\n"
            + "Prof. Dilvan de Abreu Moreira - Universidade de São Paulo\n"
            + "São Carlos - Novembro de 2018\n");
  }

  protected void
      reLogin() { // método usado quando for necessário obrigar novo login (usuário logado se
    // deletou)
    framePrincipal.setVisible(false);
    framePrincipal.removeAll();
    framePrincipal = new JFrame();
    framePrincipal.setResizable(false);
    framePrincipal.setLocationRelativeTo(null); // coloca a janela no centro da tela
    loginScreen();
  }

  protected void loginScreen() {
    menulogin = new Login_P(this);
    framePrincipal.add(menulogin);
    framePrincipal.setTitle("Tela de Login");
    framePrincipal.pack();
    framePrincipal.setVisible(true);
  }

  protected void removeLoginScreen() {
    framePrincipal.setVisible(false);
    framePrincipal.remove(menulogin);
  }

  protected void UpdateLoginScreen() {
    menulogin.populaSeletorUsuário(this);
  }

  protected void PrimeiroCadastro(JFrame pai, boolean forceADM) {
    primeiroCadastroFrame = new NovoUsuario_F(this, true, this);
  }

  protected void menuOPC() {
    menuPrincipal = new Menu_P(this);
    framePrincipal.setTitle("Controle de Estoque - PetShop da EngComp");
    framePrincipal.add(menuPrincipal); // coloca o menu de opções principal no frame do governador
    framePrincipal.pack();
    framePrincipal.setVisible(true);
  }

  protected void removeMenuOPC() {
    framePrincipal.setVisible(false);
    framePrincipal.remove(menuPrincipal);
  }

  protected void menuGerencProdutos() {
    menuprod = new GrcProdutos_P(this);
    framePrincipal.setTitle("Gerenciamento de Produtos - PetShop da EngComp");
    framePrincipal.add(menuprod); // coloca o menu de opções principal no frame do governador
    framePrincipal.pack();
    framePrincipal.setVisible(true);
  }

  protected void removeMenuGerencProdutos() {
    framePrincipal.setVisible(false);
    framePrincipal.remove(menuprod);
  }

  protected void menuGerencUsuários() {
    menuprod = new GrcProdutos_P(this);
    framePrincipal.setTitle("Gerenciamento de Produtos - PetShop da EngComp");
    framePrincipal.add(menuprod); // coloca o menu de opções principal no frame do governador
    framePrincipal.pack();
    framePrincipal.setVisible(true);
  }

  protected void removeMenuGerencUsuários() {}

  public UIGovernor_F(Usuários UserBase) {
    this.UserBase = UserBase;
    Saudação(); // roda a saudação
    framePrincipal = new JFrame();
    framePrincipal.setResizable(false);
    framePrincipal.setLocationRelativeTo(null); // coloca a janela no centro da tela
    loginScreen();
  }

  public JFrame getFrame() {
    return this.framePrincipal;
  }
}
