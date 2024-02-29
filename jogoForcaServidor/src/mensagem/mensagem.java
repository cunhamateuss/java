/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensagem;

import java.time.LocalDateTime;
import javax.swing.JTextArea;

/**
 *
 * @author a
 */
public class mensagem {
  public static void msgLog(JTextArea ta,String msg)
    {
       ta.setText(ta.getText() + msg + " " +  LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute()+":"+ 
               LocalDateTime.now().getSecond() + "\n");  
    }
}
