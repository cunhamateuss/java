/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MCexecutaveis;
import gestao.MCPortatil;
import gestao.MCSmartphone ;       
/**
 *
 * @author a
 */
public class main {
    
    
    public static void main (String[] args) throws InterruptedException{
        
        MCSmartphone sm = new MCSmartphone("Samsung","64",4,"193L2","Ultima geracao de smartphones",999.00);
        sm.setMCmarca("Samsung");
        sm.setMCarmazenamento("64");
        sm.setMCram(4);
        
        System.out.println("" + sm.info(0.2));
        
        
        //System.out.println("O preço do celular com desconto é: "+sm.info(0.2));
        
        MCPortatil p = new MCPortatil("Samsung","Intel i5",15.6,"4152J1","Novo",599.00);
        p.setMCMarca("Samsung");
        p.setMCProcessador("Intel i5");
        p.setMCTamecra(15.6);
         
        
        p.acaoPortatil();
}
}