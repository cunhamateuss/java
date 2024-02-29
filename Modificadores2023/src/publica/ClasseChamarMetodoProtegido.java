/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publica;

/**
 *
 * @author a
 */
public class ClasseChamarMetodoProtegido {
    protected void metodoProtegido(){
        System.out.println("Esse é um metodo protegido");
    }
    
    void metodoDefault(String nome){
        System.out.println(nome);
    }
}
