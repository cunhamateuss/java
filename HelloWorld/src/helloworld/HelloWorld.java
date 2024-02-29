/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano,meses,dias;
    Scanner s = new Scanner(System.in);
    
    System.out.println("Insira sua idade em anos");
    ano=s.nextInt();
    System.out.println("Quantos meses tem");
    meses=s.nextInt();
    System.out.println("Insira quantos dias tem");
    dias=s.nextInt();
    System.out.printf("Você tem %d dias",ano*365+meses*30+dias);
    }
    
}
