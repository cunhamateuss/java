/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentoerro;

/**
 *
 * @author a
 */
public class Erros extends Exception  {

        private String idioma;
    public Erros(String message,String idioma) {
        super(message);
        this.idioma=idioma;
    }
    
    public String mensagemTraduzida()
    {
        switch(idioma)
        {
            case "pt":
                return "Foi passado o parâmetro -erro";
                
            case "eng":
                return "The parameter -erro has passed";
            
            case "es":
                return "Hay passado lo parametro -erro";
            
            case "fr":
                return "Le paramètre -error est passé";
            
            default:
                return "Não Foi Passado Nenhum Parâmetro";
        } 
    }
}
