package EnviandoDadosThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author a
 */
public class EnviarDados extends Thread {
    
    private int id;
    
    public EnviarDados(int id){
        this.id=id;
    }
    
    @Override
    public void run(){
        while (true){
            
            /*try {
                sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("Erroooo");
            }*/
            System.out.println(id);
        }
    }
}
