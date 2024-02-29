/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publica;

/**
 *
 * @author a
 */
public abstract class ClasseAbstrata { //não pode ser instanciada
    public void metodo1()
    {
            System.out.println("metodo 1");
            semAcesso(0);
            ClasseChamarMetodoProtegido ccmp = new ClasseChamarMetodoProtegido();
            ccmp.metodoProtegido();
            ccmp.metodoDefault("Mateus");
    }
    private char semAcesso(int n1){
        System.out.println("Sem acesso");
     
        return '?';
    }
    
   public abstract void metodoAbstrato(char letra,boolean estado);
}
