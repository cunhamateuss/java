package modificadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public abstract class AnimalAbstract implements Animal {
    protected String nome;

    public AnimalAbstract(String nome) {
        this.nome = nome;
    }
   
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}
