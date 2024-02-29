/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class MCSmartphone extends MCProduto {
    
    private String MCmarca;
    private String MCarmazenamento;
    private double MCram;

    
    
    public MCSmartphone(String MCmarca, String MCarmazenamento, double MCram, String codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.MCmarca = MCmarca;
        this.MCarmazenamento = MCarmazenamento;
        this.MCram = MCram;
    }
    
    public String getMCmarca() {
        return MCmarca;
    }

    public void setMCmarca(String MCmarca) {
        this.MCmarca = MCmarca;
    }

    public String getMCarmazenamento() {
        return MCarmazenamento;
    }

    public void setMCarmazenamento(String MCprocessador) {
        this.MCarmazenamento = MCprocessador;
    }

    public double getMCram() {
        return MCram;
    }

    public void setMCram(double MCtamEcra) {
        this.MCram = MCram;
    }
       
    public String info(double desconto) {
        
        desconto = getPreco()*0.2;
        double precoDesconto = getPreco() - desconto;
        return "Smartphone: " + getDescricao() + 
                "\nMarca: " + MCmarca + 
                "\nArmazenamento: " + MCarmazenamento + 
                "\nMemória RAM: " + MCram + "GB"
                + "\nPreço com desconto: R$" + precoDesconto;
    }
}
    
