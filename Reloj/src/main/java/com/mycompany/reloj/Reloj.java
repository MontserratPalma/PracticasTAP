/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
package com.mycompany.reloj;

import java.util.Calendar;
import javax.swing.JTextField;


/**
 *
 * @author Monts
 */


//ESTE METODO SOLO SIRVE PARA PONER LA HORA ESTATICA Y EN CASO DE TENER UN 07, SOLO PONE EL 7

/*

public class Reloj extends Thread {
private Thread clockThread;
    private JTextField caja;
    
  
    

    public Reloj(JTextField caja) {
        this.caja = caja;
    }
    
            
  public void run(){
      while(true){
         try {
             Calendar c=Calendar.getInstance();
             
             int hora=c.get(Calendar.HOUR);
             int minutos=c.get(Calendar.MINUTE );
             int segundos=c.get(Calendar.SECOND);
               
            
            //HORA ESTATICA
           /* String hour =String.format("%02d", c.get(Calendar.HOUR_OF_DAY));
            String minute=String.format("%02d", c.get(Calendar.MINUTE));
            String time = hour + ":"+ minute;
              //OTRA manera para arreglar los minutos pero no funciono 
          // String time = String.format("%02:%02d"+  c.get(Calendar.HOUR_OF_DAY)+  c.get(Calendar.MINUTE));
           */
   /*       
         String time = hora+ ":" + minutos + ":" + segundos;
          
          this.caja.setText(time);
          Thread.sleep(1000);
         } catch(InterruptedException ex){
              System.out.println("error hilo");
              }
      } 
  }
 private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {
        clockThread.interrupt();
    }

    private void handleThreadInterruption(InterruptedException ex) {
        // Manejar la excepción si el thread es interrumpido
    }
 
}

