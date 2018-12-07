package Classes_Base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Estoque {
  private static Produtos listaProdutos;

  public Estoque() {
    listaProdutos = new Produtos();
  }

  public static boolean adicionarProduto(String nome, int quantidade, double preco) {
    listaProdutos.adicionarProduto(nome, quantidade, preco);
    return true;
  }

  public static ArrayList<Produto> buscarProdutos(String nomeProduto) {
    return listaProdutos.buscarProdutos(nomeProduto);
  }

  public static Produto buscarProduto(String nomeProduto) {
    return listaProdutos.buscarProduto(nomeProduto);
  }

  public static Produto buscarProduto(int index) {
    return listaProdutos.buscarProduto(index);
  }

  public static int sizeOfEstoque() {
    return listaProdutos.sizeOfEstoque();
  }

  public static void reduzirQtdProduto(String nomeProduto, int qtd) {
    Produto atual = listaProdutos.buscarProduto(nomeProduto);
    atual.setQuantidade(atual.getQuantidade() - qtd);
  }

  public static void gravarEstoque() {
    try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("Estoque.txt"))) {
      for (int i = 0; i < listaProdutos.sizeOfEstoque(); i++) {
        listaProdutos.buscarProduto(i);
        buffWrite.append(listaProdutos.buscarProduto(i).toArquivo());
        buffWrite.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void lerEstoque() {
    String linha = "";
    String linhaSplit[] = new String[3];
    boolean flagEOF = false;

    try (BufferedReader buffRead = new BufferedReader(new FileReader("Estoque.txt"))) {
      while (!flagEOF) {
        linha = buffRead.readLine();
        if (linha != null) {
          linhaSplit = linha.split(" ");
          Estoque.adicionarProduto(
              linhaSplit[0], Integer.parseInt(linhaSplit[1]), Double.parseDouble(linhaSplit[2]));
        } else {
          flagEOF = true; // atingiu o fim do arquivo
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
