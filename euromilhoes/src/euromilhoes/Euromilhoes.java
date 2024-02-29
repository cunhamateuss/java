/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package euromilhoes;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author a
 */
public class Euromilhoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random randomGenerator = new Random();
    
    int numeros[] = new int[5];
    int tentativas[] = new int[5];
    Scanner ler = new Scanner(System.in);
    int i=0,iguais=0;
    
    do
    {
        numeros[i] = randomGenerator.nextInt(49)+1;
        i++;
        
    }while(i<5);
   
    while (numeros[0]==numeros[1] || numeros[0]==numeros[2] || numeros[0]==numeros[3] || numeros[0]==numeros[4] )
        numeros[0] = randomGenerator.nextInt(49)+1;
    while (numeros[1]==numeros[0] || numeros[1]==numeros[2] || numeros[1]==numeros[3] || numeros[1]==numeros[4] )
        numeros[1] = randomGenerator.nextInt(49)+1;
    while (numeros[2]==numeros[0] || numeros[2]==numeros[1] || numeros[2]==numeros[3] || numeros[2]==numeros[4] )
        numeros[2] = randomGenerator.nextInt(49)+1;
    while (numeros[3]==numeros[0] || numeros[3]==numeros[1] || numeros[3]==numeros[2] || numeros[3]==numeros[4] )
        numeros[3] = randomGenerator.nextInt(49)+1;
while (numeros[4]==numeros[0] || numeros[4]==numeros[2] || numeros[4]==numeros[3] || numeros[4]==numeros[1] )
        numeros[4] = randomGenerator.nextInt(49)+1;    
    
    
    
    for(i=0;i<tentativas.length;i++){
    System.out.println("Introduza um número entre (1-49): \n");    
    tentativas[i]=ler.nextInt();
    }
    
    System.out.println("Os números sorteados são: \n");
    for(int j : numeros){
    System.out.printf("%d\n", j);
    }
    
    int rand = randomGenerator.nextInt(13)+1;
    System.out.println("E a estrela é: \n"+rand);
    
    
    for(int k=0;k<numeros.length;k++)
        for(int j=0;j<tentativas.length;j++)
    {
    if(numeros[k]==tentativas[j])
       iguais++;
    }
    
    if(iguais>1)
    System.out.printf("Você acertou %d números!",iguais);
    else if (iguais==1)
        System.out.printf("Você acertou %d número",iguais);
    else
        System.out.println("Você não acertou nenhum número!");
    }
    
}
