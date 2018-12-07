package Classes_Base;

import java.util.ArrayList;
import java.util.HashMap;

public class Produtos {
  private ArrayList<Produto> listaProdutos;
  private HashMap<String, Integer> indiceProduto;
  private int num_produtos;

  public Produtos() {
    listaProdutos = new ArrayList<Produto>();
    indiceProduto = new HashMap<String, Integer>(50, (float) 0.75);
    num_produtos = 0;
  }

  public boolean adicionarProduto(String nome, int quantidade, double preco) {
    if (this.indiceProduto.get(nome) == null) {
      Produto novo = new Produto(nome, quantidade, preco);
      if (this.listaProdutos.add(novo)) {
        Integer index = new Integer(this.listaProdutos.indexOf(novo));
        this.indiceProduto.put(nome, index);
        this.num_produtos++;
        return true;
      } else System.out.println("Erro na criação do Usuário.");
    } else System.out.println("Usuário já existe.");
    return false;
  }

  public ArrayList<Produto> buscarProdutos(String nomeProduto) {
    CharSequence pattern = nomeProduto;
    ArrayList<Produto> buscado = new ArrayList<Produto>();
    for (Produto atual : this.listaProdutos) {
      if (atual.getNome().contains(pattern))
        buscado.add(new Produto(atual.getNome(), atual.getQuantidade(), atual.getPreco()));
    }
    return buscado;
  }

  public int sizeOfEstoque() {
    return this.num_produtos;
  }

  public Produto buscarProduto(String nomeProduto) {
    return this.listaProdutos.get(this.indiceProduto.get(nomeProduto));
  }

  public Produto buscarProduto(int index) {
    return this.listaProdutos.get(index);
  }
}
