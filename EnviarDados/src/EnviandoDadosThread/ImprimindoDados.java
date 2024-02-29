package EnviandoDadosThread;

import EnviandoDadosThread.EnviarDados;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author a
 */
public class ImprimindoDados {

    public static void main(String[] args) {

        int i = 0;
while(true){
        InterfaceDados td = new InterfaceDados();
        Thread t = new Thread(td);
        EnviarDados enviar = new EnviarDados(i);
        enviar.start();
        t.start();
        i++;
}
        //System.out.println("Acabou");

    }
}
