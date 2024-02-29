/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import protegida.ClasseMetodoProtegido;
import publica.ClasseAbstrata;
import publica.ClasseChamarMetodoProtegido;
import publica.ClassePublica;
/**
 *
 * @author a
 */
public class ClasseMain {
    
    public static void main(String[] args) {
     
        ClassePublica cp = new ClassePublica();
        // ClasseDefault cd = new ClasseDefault(); só pode ser acerdida na msm package
        //ClasseAbstrata ca = new ClasseAbstrata(); não pode instanciar uma classe abstrata
        cp.metodo1();
        //cp.semAcesso(1); não é possível aceder a um metodo privado aonde ele foi definido
        ClasseChamarMetodoProtegido ccmp = new ClasseChamarMetodoProtegido();
           // ccmp.metodoDefault("Mateus"); não pode ser acedido fora da package
    }
}
