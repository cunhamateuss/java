/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores;
import modificadores.Animal;
import modificadores.AnimalAbstract;
import modificadores.Ave;
import modificadores.Mamifero;
import modificadores.Reptil;
/**
 *
 * @author a
 */
public class Zoologico {
    public static void main(String[] args) {
        // Criação das instâncias das classes Mamifero, Ave e Reptil
        Mamifero mamifero = new Mamifero("Leão");
        Ave ave = new Ave(2.5, "Aguia");
        Reptil reptil = new Reptil( 28.5,"Cobra");

       
        mamifero.emitirSom();
        mamifero.mover();

        ave.emitirSom();
        ave.mover();
        ave.planar();

        reptil.emitirSom();
        reptil.mover();
        reptil.rastejar();
    }
}
