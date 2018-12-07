package Classes_Base;

public class Produto {
  private String nome;
  private int quantidade;
  private double preco;

  public Produto(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public Produto(String nome, int quantidade) {
    this.nome = nome;
    this.quantidade = quantidade;
  }

  public String toString() {
    return "//" + this.nome + "," + this.quantidade + "//";
  }

  public String toArquivo() {
    return (this.nome + " " + this.quantidade + " " + this.preco);
  }

  public Object[] toData() {
    Object[] data = new Object[4];
    data[1] = nome.toString();
    data[2] = new Integer(quantidade);
    data[3] = new Double(preco);
    return data;
  }

  public String getNome() {
    return nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
