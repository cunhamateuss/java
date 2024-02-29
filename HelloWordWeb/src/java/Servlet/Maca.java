/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author a
 */
public class Maca {
    private String cor;
    private boolean madura;
    private int tamanho;


    
    public Maca(String cor, boolean madura, int tamanho) {
        this.cor = cor;
        this.madura = madura;
        this.tamanho = tamanho;
    }
    
     public String getCor() {
        return cor;
    }

    public boolean isMadura() {
        return madura;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    
    public String mostraMaca(){

        return "A maça de cor "+ cor +" está " + (madura?"madura":"verde") + " e é do tamanho " + tamanho+"cm";
    }
}
