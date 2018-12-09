/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Base;

import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Está classe gerencia um array list de todos os pedidos realizados durante a execução do programa. Tem funcionalidades de gravar o array list em arquivos
 * e ler este arquivo para o array list durante a inicialização do programa. Bem como gerenciar o array list de pedidos, adicionando novos pedidos ao array list.
 * @author niloc
 */
public class ListaDeVendas {
    //ArrayList que mantém todos os pedidos já realizados até o momento.
    private static ArrayList<Pedido> listaDePedidosTotal=new ArrayList();
    
    /**
     * Adiciona pedido à listaDePedidosTotal
     * @param pedido pedido que será adicionado à listaDePedidosTotal
     */
    public static void adicionarPedido(Pedido pedido)
    {
        listaDePedidosTotal.add(pedido);
    }
    
    /**
     * Método que retorna o tamanho do arrayList listaDePedidosTotal
     * @return tamanho do ArrayList listaDePedidosTotal
     */
    public static int tamanhoArrayPedidos()
    {
        return listaDePedidosTotal.size();
    }
    
    /**
     * Método que retorna um pedido da listaDePedidosTotal
     * @param index índice de um pedido na ArrayList listaDePedidosTotal
     * @return retorna o pedido cuja posiçao no ArrayList é index
     */
    public static Pedido getPedido(int index)
    {
        return listaDePedidosTotal.get(index);
    }
    
    /**
     * Método que Grava os pedidos da listaDePedidosTotal em um arquivo chamado logVendas.txt
     */
    public static void gravarLogVendas()
    {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("logVendas.txt"))) {
            for(int i=0;i<listaDePedidosTotal.size();i++)
            {
                buffWrite.append("**************************************************");
                buffWrite.newLine();
                buffWrite.append("Pedido:"+(i+1));
                buffWrite.newLine();
                buffWrite.append("Vendedor:"+listaDePedidosTotal.get(i).getIdVendedor());
                buffWrite.newLine();
                buffWrite.append("Cliente:"+listaDePedidosTotal.get(i).getNomeCliente());
                buffWrite.newLine();
                buffWrite.append("Tipo de Pagamento:"+listaDePedidosTotal.get(i).getTipoDePagamento());
                buffWrite.newLine();
                buffWrite.append("Produtos Pedidos(nome,quantidade):");
                for(int j=0;j<listaDePedidosTotal.get(i).getProdutosPedidos().size();j++)
                {
                    buffWrite.append(listaDePedidosTotal.get(i).getProdutosPedidos().get(j).getNome()+","+listaDePedidosTotal.get(i).getProdutosPedidos().get(j).getQuantidade());
                    if(j==listaDePedidosTotal.get(i).getProdutosPedidos().size()-1)
                    {
                        buffWrite.newLine();
                    }
                    else
                    {
                        buffWrite.append(" | ");
                    }
                }
                
                if(i==listaDePedidosTotal.size()-1)
                {
                    buffWrite.append("Valor Total (R$):"+listaDePedidosTotal.get(i).getValorTotal());
                }
                else
                {
                    buffWrite.append("Valor Total (R$):"+listaDePedidosTotal.get(i).getValorTotal());
                    buffWrite.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Método que lê os pedidos que estão guardados no arquivo logVendas.txt durante o inicio do programa
     */
    public static void lerLogVendas()
    {
        String linha = "";
        String linhaSplit[] = new String[2];
        String linhaProdSplit[];
        int contadorDeProdutos;
        Pedido pedido;
        
        try (BufferedReader buffRead = new BufferedReader(new FileReader("logVendas.txt"))) {
            while((buffRead.readLine())!=null) //Ler primeira linha de um pedido: ************************
            {
                contadorDeProdutos=0;
                pedido=new Pedido();
                
                if((linha=buffRead.readLine())==null)//ler segunda linha: Pedido:x
                {
                    System.out.println("arquivo criado.");
                    new File("logVendas.txt").createNewFile();
                    break;
                }
                
                if((linha=buffRead.readLine())!=null)//ler id Vendedor
                {
                    linhaSplit = linha.split(":",2); // [0]id  [1]variavel
                    pedido.setIdVendedor(linhaSplit[1]);
                }
                
                if((linha=buffRead.readLine())!=null)//ler nome cliente
                {
                    linhaSplit = linha.split(":",2); // [0]nome  [1]variavel
                    pedido.setNomeCliente(linhaSplit[1]);
                }

                if((linha=buffRead.readLine())!=null)// ler tipo pagamento
                {
                    linhaSplit = linha.split(":",2); // [0]tipo  [1]variavel
                    pedido.setTipoDePagamento(linhaSplit[1]);
                }
                
                if((linha=buffRead.readLine())!=null)//ler produtos
                {
                    linhaSplit = linha.split(":",2); // [0]produto  [1]variavel
                    linha=linhaSplit[1];
                    for(int i=0;i<linha.length();i++)
                    {
                        if(linha.charAt(i)==',')
                         {
                             contadorDeProdutos++;
                        }
                    }
                    if(contadorDeProdutos==1)
                    {
                        linhaSplit=linha.split(",");
                        pedido.getProdutosPedidos().add(new Produto(linhaSplit[0],Integer.parseInt(linhaSplit[1])));
                    }
                    else
                    {
                        linhaProdSplit=linha.split(" \\| ");
                        for(int i=0;i<contadorDeProdutos;i++)
                        {
                            linhaSplit=linhaProdSplit[i].split(",");
                            pedido.getProdutosPedidos().add(new Produto(linhaSplit[0],Integer.parseInt(linhaSplit[1])));
                        }
                    }
                }
                
                if((linha=buffRead.readLine())!=null)// ler valor total
                {
                    linhaSplit = linha.split(":",2); // [0]R$  [1]variavel
                    pedido.setValorTotal(Double.parseDouble(linhaSplit[1]));
                }
                //pedido é adicionado a listaDePedidosTotal.
                adicionarPedido(pedido);
            }
        }
        catch(Exception e) {
            try {
            File file = new File("logVendas.txt");
            file.createNewFile();
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(new JFrame(),"Erro ao tentar criar o arquivo de logVendas.txt.");
            }
            //e.printStackTrace();
        }
    }
}
