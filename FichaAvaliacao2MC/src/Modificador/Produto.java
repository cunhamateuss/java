/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modificador;

/**
 *
 * @author a
 */
public abstract class Produto {
    protected String nome;
    protected float preco;
    
    

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
        
    public abstract float calcularTotal();
}
