package publica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public final class ClassePublica extends ClasseAbstrata { //não pode ser super classe
 ClasseDefault cd = new ClasseDefault();   
 
 protected void metodoProtegido()
    {
        System.out.println("Este é um metódo protegido");
    }

    @Override
    public void metodoAbstrato(char letra, boolean estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}