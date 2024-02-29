package modificadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class Ave extends AnimalAbstract{
 
     protected double tamanhoAsa;

    public Ave(double tamanhoAsa, String nome) {
        super(nome);
        this.tamanhoAsa = tamanhoAsa;
    }

    @Override
    public void emitirSom() {   
        System.out.println("As aves Grasnam Muito!");
    }

    
    public void planar() {
        System.out.println("A ave plana!");
    }
     
    public void mover() {
        System.out.println("A ave voa com suas asas.");
    }

    
    
    
    
    
    
    
    
}
