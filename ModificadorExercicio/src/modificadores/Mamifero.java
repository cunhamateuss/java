package modificadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class Mamifero extends AnimalAbstract {
    public static final String[] TIPO_ALIMENTACAO = {"Carnívoro","Herbivoro","Omnivoro"};
    private String tipoAlimentacao;

    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
            System.out.println("Os mamíferos tem um som diferente cada um");
    }

    public void mover() {
       System.out.println("O mamífero se move com as patas.");
    }
     
   

    
    
}
