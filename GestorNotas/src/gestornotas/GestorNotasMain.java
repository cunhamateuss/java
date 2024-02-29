
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestornotas;

import static gestornotas.GestorNotas.calcularMedia;
import static gestornotas.GestorNotas.lerNotas;
import java.io.IOException;
/**
 *
 * @author a
 */
public class GestorNotasMain {
    public static void main(String[] args) throws Exception {
         System.out.println("Gestor de Notas");
        try{
            
         double notas[]=lerNotas(); 
        calcularMedia(notas);
        } catch(IllegalStateException e)
        {
            System.out.println("Error 142131231");
        }
    }
}
