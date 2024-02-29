/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mensagem;

import java.awt.Color;
import java.time.LocalDateTime;
import java.util.Random;
import javax.swing.JTextArea;


/**
 *
 * @author a
 */
public class mensagem {
    
    //private String coresResult(JTextArea taCores){
      //  taCores.setText(Integer.Color);
        //Color.getColor(Color);
        //return "a";
    //}
    public static void msgLog(JTextArea taLogs,String msg)
    {
       taLogs.setText(taLogs.getText() + msg + " " +  LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute()+":"+ 
               LocalDateTime.now().getSecond() + "\n");  
    }
}
