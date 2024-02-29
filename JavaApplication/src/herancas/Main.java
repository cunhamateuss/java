/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        Liquidificador l1 = new Liquidificador();
        
        System.out.println("--Liquidificador--\nInsira a cor: \n");
        l1.setCor(s1.nextLine());
        System.out.println("Insira o fabricante: \n");
        l1.setFabricante(s1.nextLine());
        System.out.println("Insira o tempo de garantia: \n");
        l1.setGarantia(s1.nextInt());
        System.out.println("Insira a voltagem do aparelho: \n");
        l1.setVoltagem(s1.nextInt());
        
        
        System.out.println("O Liquidificador tem a cor: "+l1.getCor() + ",é do fabricante: "+l1.getFabricante() + ",Tem de garantia de: "+l1.getGarantia()+" anos"+", e tem voltagem de: "+l1.getVoltagem()+" Watts");
        
        
        System.out.println("Qual o número de rotações do Liquidificador: \n");
        //l1.setRotacao(s1.nextInt());
        System.out.println("A velocidade do Liquidificador é de: ");
        //l1.velocidade();
        
        System.out.println("Qual o número de dentes do Liquidificador: \n");
        //l1.setnDentes(s1.nextInt());
        
        System.out.println("O Liquidificador tem: "+l1.getRotacao()+" rotações por minuto"+",e tem: "+l1.getnDentes()+" dentes");
        
        System.out.println("Desligando o Liquidificador...");
        l1.desligar();
        System.out.println("Ligando o Liquidificador...");
        l1.ligar();
        
        System.out.println("A auto limpeza começara!\n");
        l1.autoLimpeza();
       
        
        
        
        
        
    }
    
}
