package tratamentoerro;

 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


 

/**
*
* @author a
*/
public class TratamentoErro {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

 FileWriter fileOut;

    try {
               fileOut = new FileWriter("resultado.txt", true);
                
                for (int i = 0; i < args.length; i++){
                String arg = args[i];
                fileOut.write(arg + "\n");
                if (args[i].equals("-erro"))
                    {
                    //fileOut.close();
                    throw new Erros("Foi passado o parâmetro -erro: ","es");       
                    }
                }
                fileOut.close();
    }      catch (IOException e){
            System.out.println("Ocorreu um erro de entrada e saída" + e.getMessage());
               } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Acesso ilegal a uma posição do vetor."+e.getMessage());
                } catch (Erros e) {
                System.out.println(e.mensagemTraduzida());
                } catch (Exception e){
                  System.out.println("Ocorreu uma exceção genérica"+ e.getMessage()+"da classe: "+e.getClass());
                } finally{
        
    }
    
    
       /* try {
            copyFile(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        } catch (IOException ex){
            System.out.println("erro io");
        } catch (Exception ex){
            System.out.println("erro genérico");
        }*/
    
    }

 

   public static void copyFile(String sourceFile) throws FileNotFoundException,
            IOException {
            File inputFile = new File(sourceFile);
            File outputFile = new File("Output.txt");
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c = in.read()) != -1){
            out.write(c);
            }
            in.close();
            out.close();
            System.out.println("Cópia realizada com sucesso.");
}

    }