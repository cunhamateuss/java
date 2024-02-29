/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancas;

/**
 *
 * @author a
 */
public class Liquidificador extends Eletrodomesticos {

    public Liquidificador() {
        System.out.println("O objeto foi criado");
    }
    
    int i;

    private int rotacao;
    private int nDentes;
    
    
    public int getRotacao() {
        return rotacao;
    }

    public void setRotacao(int rotacao) {
        this.rotacao = rotacao;
    }
    
    public int getnDentes() {
        return nDentes;
    }

    public void setnDentes(int nDentes) {
        this.nDentes = nDentes;
    }
   
    public int velocidade(){
    return rotacao*nDentes;
    }
    public void autoLimpeza(){
    System.out.println("Auto Limpeza concluida!");
     i++;
    System.out.printf("%d vez(es) limpo", i);
    }
    
}
