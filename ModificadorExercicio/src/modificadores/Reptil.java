package modificadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class Reptil extends AnimalAbstract{
    
    protected double temperaturaCorporal;

    public Reptil(double temperaturaCorporal, String nome) {
        super(nome);
        this.temperaturaCorporal = temperaturaCorporal;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("O Réptil está fazendo barulho!");
    }

    public void rastejar() {
        System.out.println("Rastejando");
    }

    public void mover() {
        System.out.println("O réptil se move rastejando.");
    }
    
}
