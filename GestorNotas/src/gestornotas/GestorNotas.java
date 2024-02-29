/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestornotas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class GestorNotas {

    public static double[] lerNotas() {
        int qntnotas;
        int i = 0;
        
        Scanner ler = new Scanner(System.in);
        try {
            System.out.println("Introduza quantas notas irá colocar: ");
            qntnotas = ler.nextInt();
            double notas[] = new double[qntnotas];

            ler.nextLine();

            for (i = 0; i < qntnotas; i++) {

                int j = i + 1;
                System.out.println("Introduza a nota " + j);
                notas[i] = ler.nextDouble();
                
            }
            return notas;
        } catch (InputMismatchException e) {
            System.out.println("Erro 1231312");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Valor inválido! Por favor, insira um número válido.");
        } catch (Exception e) {
            System.out.println("Valor inválido erro 2");
        }
      return new double[i];  
    }

    public static double calcularMedia(double notas[]) throws Exception {
        int qntnotas = notas.length;
        double media;
        double soma = 0.0;
        for (double nota : notas) {
            soma = soma + nota;
        }

        try {
            if (qntnotas == 0) {
                throw new Exception("Error 1");
            }
            media = soma / qntnotas;
            System.out.println("Média é: " + media);
            return media;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
}
