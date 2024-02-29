/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestao;

import static java.lang.Thread.sleep;

/**
 *
 * @author a
 */
public class MCPortatil extends MCProduto {

    public MCPortatil(String MCMarca, String MCProcessador, double MCTamecra, String codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
        this.MCMarca = MCMarca;
        this.MCProcessador = MCProcessador;
        this.MCTamecra = MCTamecra;
    }
    
    private String MCMarca;
    private String MCProcessador;

    public void limpar(){
        
    }
    
    public void acaoPortatil() throws InterruptedException
    {
        MCPortatil p = new MCPortatil("Samsung","Intel i5",15.6,"4152J1","Portátil Novo",599.00);
        if (p.MCMarca == "Samsung"){
                System.out.println("Fez uma boa escolha ao levar o seu novo Portátil");
                System.out.println("Até a proxima!");
                System.out.println("Limpando as compras....");
                
                sleep(4000);
                
                for (int i=0; i<50; i++)
                    System.out.print("\n");
               
        }
        else
            System.out.println("Talvez um da Samsung seria uma boa opção!");
    
    
    }
 
    
    public String getMCMarca() {
        return MCMarca;
    }

    public void setMCMarca(String MCMarca) {
        this.MCMarca = MCMarca;
    }

    public String getMCProcessador() {
        return MCProcessador;
    }

    public void setMCProcessador(String MCProcessador) {
        this.MCProcessador = MCProcessador;
    }

    public double getMCTamecra() {
        return MCTamecra;
    }

    public void setMCTamecra(double MCTamecra) {
        this.MCTamecra = MCTamecra;
    }
    private double MCTamecra;

    
    
    
    

}
