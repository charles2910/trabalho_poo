package Classes_Base;

import Classes_UI.UIGovernor_F;

public class Main
{
        public static void  main(String[] args) {
            ListaDeVendas.lerLogVendas();
            Estoque loja = new Estoque();  

            Usuários UserBase = new Usuários();
            
            Usuário teste = new Usuário("User1(sem senha) ", "", true);
            Usuário teste2 = new Usuário("User 2(sem senha) ", "", false);
          
            UserBase.addUsuário(teste);
            UserBase.addUsuário(teste2);
            
            UIGovernor_F UImaster = new UIGovernor_F(UserBase);
            
            Estoque.lerEstoque();
            Estoque.adicionarProduto("Comida", 4, 3.99);
            Estoque.gravarEstoque();
        }
}
