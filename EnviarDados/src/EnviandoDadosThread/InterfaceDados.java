/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnviandoDadosThread;

import javax.swing.JButton;

/**
 *
 * @author a
 */
public class InterfaceDados extends JButton implements Runnable{
        @Override
        public void run(){
            System.out.println("Interface");
        }
}
