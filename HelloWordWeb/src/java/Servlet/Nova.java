/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author a
 */
public class Nova  {
   
    
  private static String[] piadas = {
        "Por que o esqueleto não brigou com ninguém? Porque ele não tinha estômago para isso!",
        "Qual é o contrário de volátil? Vem cá, sobrinho!",
        "O que o zero disse para o oito? 'Uau, seu cinto é muito descolado!'",
        "O que a mãe múmia disse para a filha múmia? 'Vista seu band-aid antes de sair!'",
        "O que o advogado da laranja disse para o juiz? 'É uma fruta cítrica, Excelência!'"
    };

    // Método para gerar uma piada aleatória
    public static String criando() {
        Random rand = new Random();
        int index = rand.nextInt(piadas.length);
        return piadas[index];
    }
}

