/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Base;

import java.util.ArrayList;

/**
 *
 * @author niloc
 */
public class Pedido {
    private String idVendedor;
    private String nomeCliente;
    private String tipoDePagamento;
    private ArrayList<Produto> produtosPedidos=new ArrayList();
    private double valorTotal;
    
    public String toString() { 
    return "IdVendedor: " + this.idVendedor + ", Nome do Cliente: " + this.nomeCliente + ", Tipo de Pagamento: " + this.tipoDePagamento + ", Carrinho: "+this.produtosPedidos+ ", Valor Total: "+this.valorTotal;
}
    
    
    public void setIdVendedor(String idVendedor)
    {
        this.idVendedor=idVendedor;
    }
    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente=nomeCliente;
    }
    public void setTipoDePagamento(String tipoDePagamento)
    {
        this.tipoDePagamento=tipoDePagamento;
    }
    public void setValorTotal(double valorTotal)
    {
        this.valorTotal=valorTotal;
    }
    
    public String getIdVendedor()
    {
        return this.idVendedor;
    }
    
    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    
    public String getTipoDePagamento()
    {
        return this.tipoDePagamento;
    }
    
    public ArrayList<Produto> getProdutosPedidos()
    {
        return this.produtosPedidos;
    }
    
    public double getValorTotal()
    {
        return this.valorTotal;
    }
   
    public double SomaTotalDosPedidos()
    {
        valorTotal=0;
        for(Produto p: produtosPedidos)
        {
            valorTotal=(valorTotal)+((p.getPreco())*(p.getQuantidade()));
        }
        return valorTotal;
    }
    
    public void addProdutoPedido(ArrayList<Produto> produto)
    {
        for(Produto p: produto)
        {
            this.produtosPedidos.add(p);
        }
    }
    
    
}
