/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExercicioRelogio;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author a
 */
public class ThreadAtualiza extends Thread {

    private JLabel lbHora;

    public ThreadAtualiza(JLabel lbHora) {
        this.lbHora = lbHora;
    }

    @Override
    public void run() {
        while (true){
            try {
                sleep(900);
            } catch (InterruptedException ex) {
                System.out.println("Error");
            }
        LocalTime d = LocalTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horario = d.format(dt);
        lbHora.setText(horario);
        }
    }
}
