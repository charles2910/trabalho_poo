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
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author niloc
 */
public class ListaDeVendas {
    private static ArrayList<Pedido> listaDePedidosTotal=new ArrayList();

    public static void adicionarPedido(Pedido pedido)
    {
        listaDePedidosTotal.add(pedido);
    }

    public static void listarTodosPedidos()
    {
        for(Pedido p: listaDePedidosTotal)
        {
            System.out.println(p);
            System.out.println("");
        }
    }

    public static Pedido getPedido(int index)
    {
        return listaDePedidosTotal.get(index);
    }

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
                buffWrite.append("Produtos Pedidos:");
                for(int j=0;j<listaDePedidosTotal.get(i).getProdutosPedidos().size();j++)
                {
                    buffWrite.append(listaDePedidosTotal.get(i).getProdutosPedidos().get(j).getNome()+","+listaDePedidosTotal.get(i).getProdutosPedidos().get(j).getQuantidade());
                    if(j==listaDePedidosTotal.get(i).getProdutosPedidos().size()-1)
                        buffWrite.newLine();
                    else
                        buffWrite.append("|");
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

    public static void lerLogVendas()
    {
        String linha = "";
        String linhaSplit[] = new String[2];
        String linhaProdSplit[];
        String linhaProdSplit2[] = new String[2];
        boolean flagEOF = false;
        Pedido pedido;

        try (BufferedReader buffRead = new BufferedReader(new FileReader("logVendas.txt"))) {
            while (!flagEOF) {
                linha = buffRead.readLine();
                if(linha != null)
                {
                    pedido = new Pedido();
                    ArrayList<Produto> listaDeCompras = new ArrayList();
                    //for(int i=0;i<6;i++)
                    //{
                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        pedido.setIdVendedor(linhaSplit[1]);

                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        pedido.setNomeCliente(linhaSplit[1]);

                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        pedido.setTipoDePagamento(linhaSplit[1]);

                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        pedido.setTipoDePagamento(linhaSplit[1]);

                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        linhaProdSplit = (linhaSplit[1]).split("|",-1);
                        for(int i=0;i<linhaProdSplit.length;i++)
                        {
                            linhaProdSplit2 = linhaProdSplit[i].split(",");
                            listaDeCompras.add(new Produto(linhaProdSplit2[0],Integer.parseInt(linhaProdSplit2[1])));
                        }
                        pedido.addProdutoPedido(listaDeCompras);

                        linha = buffRead.readLine();
                        linhaSplit = linha.split(":");
                        pedido.setValorTotal(Double.parseDouble(linhaSplit[1]));
                    //}
                }
                else
                {
                    flagEOF=true; //atingiu o fim do arquivo
                }

            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
