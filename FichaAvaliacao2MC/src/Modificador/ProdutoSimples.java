/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificador;

/**
 *
 * @author a
 */
public class ProdutoSimples extends Produto {
    protected int quantidade;

    public ProdutoSimples(int quantidade, String nome, float preco) {
        super(nome, preco);
        this.quantidade = quantidade;
    }
    
    
    
    @Override
    public float calcularTotal(){
        return preco*quantidade;
    }
    
}
