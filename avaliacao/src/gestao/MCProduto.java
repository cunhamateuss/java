/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao;
/**
 *
 * @author a
 */


public class MCProduto {
 private String MCcodigo;
 private String MCdescricao;
 private double MCpreco;

    public MCProduto(String codigo, String descricao, double preco) {
        this.MCcodigo = codigo;
        this.MCdescricao = descricao;
        this.MCpreco = preco;
    }
 
 
    public String getCodigo() {
        return MCcodigo;
    }

    public void setCodigo(String codigo) {
        this.MCcodigo = codigo;
    }

    public String getDescricao() {
        return MCdescricao;
    }

    public void setDescricao(String descricao) {
        this.MCdescricao = descricao;
    }

    public double getPreco() {
        return MCpreco;
    }

    public void setPreco(double preco) {
        this.MCpreco = preco;
    }
 
 
 
}


