/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Base;

import java.util.ArrayList;

/**
 * Está classe representa um pedido. Tem variáveis que representam um pedido como id do vendedor, nome do cliente, tipo de pagamento, lista de produtos e valor total da compra.
 * Tem funções para retornar atributos de um pedido, atribuir valores a atributos e realizar soma do valor dos pedidos contidos na lista de produtos.
 * @author niloc
 */
public class Pedido {
    //Atributos de Pedido
    private String idVendedor;
    private String nomeCliente;
    private String tipoDePagamento;
    private ArrayList<Produto> produtosPedidos=new ArrayList();
    private double valorTotal;
    
    public String toString() { 
    return "IdVendedor: " + this.idVendedor + ", Nome do Cliente: " + this.nomeCliente + ", Tipo de Pagamento: " + this.tipoDePagamento + ", Carrinho: "+this.produtosPedidos+ ", Valor Total: "+this.valorTotal;
}
    
    /**
     * Atribui um valor a idVendedor
     * @param idVendedor
     */
    public void setIdVendedor(String idVendedor)
    {
        this.idVendedor=idVendedor;
    }

    /**
     * Atribui um valor a nomeCliente
     * @param nomeCliente
     */
    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente=nomeCliente;
    }

    /**
     * Atribui um valor ao tipoDePagamento
     * @param tipoDePagamento
     */
    public void setTipoDePagamento(String tipoDePagamento)
    {
        this.tipoDePagamento=tipoDePagamento;
    }

    /**
     * Atribui um valor a valorTotal
     * @param valorTotal
     */
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal=valorTotal;
    }
    
    /**
     * Método que retorna valor de idVendedor
     * @return valor de idVendedor
     */
    public String getIdVendedor()
    {
        return this.idVendedor;
    }
    
    /**
     * Método que retorna valor de nomeCliente
     * @return valor de nomeCliente
     */
    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    
    /**
     * Método que retorna valor de tipoDePagamento
     * @return valor de tipoDePagamento
     */
    public String getTipoDePagamento()
    {
        return this.tipoDePagamento;
    }
    
    /**
     * Método que retorna ArrayList de produtos que foram comprados pela pessoa
     * @return ArrayList de produtos que foram comprados pela pessoa (produtosPedidos)
     */
    public ArrayList<Produto> getProdutosPedidos()
    {
        return this.produtosPedidos;
    }
    
    /**
     * Método que retorna valor de valorTotal
     * @return valor de valorTotal
     */
    public double getValorTotal()
    {
        return this.valorTotal;
    }
   
    /**
     * Método que rétodo que calcula o valor da soma de todos os produtos
     * @return valor da soma de todos os produtos que foram comprados
     */
    public double somaTotalDosPedidos()
    {
        valorTotal=0;
        for(Produto p: produtosPedidos)
        {
            valorTotal=(valorTotal)+((p.getPreco())*(p.getQuantidade()));
        }
        return valorTotal;
    }
    
    /**
     * Método que atribui uma lista de produtos ao ArrayList variável produtosPedidos
     * @param produto ArrayList de produtos
     */
    public void addProdutoPedido(ArrayList<Produto> produto)
    {
        for(Produto p: produto)
        {
            this.produtosPedidos.add(p);
        }
    }
    
    
}
