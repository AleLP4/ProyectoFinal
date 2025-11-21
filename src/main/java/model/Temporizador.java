/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.SwingUtilities;
import view.PanelControl;

/**
 *
 * @author TI-IN
 */
public class Temporizador extends Thread
{
  
    
    
    
    private PanelControl panel;
    
    private boolean activo;
    
    private int segundos;

    public Temporizador(PanelControl panel) {
        this.panel = panel;
        this.activo = true;
        this.segundos = 0;
    }

    public int getSegundos() {
        return segundos;
    }
   
  
    
   public void run ()
   {
      while(activo)
      {
          try
            {
              Thread.sleep(1000);
            }catch (InterruptedException e) {
            
            activo=false;
            
            }//fin try
          segundos++;
          SwingUtilities.invokeLater(new Runnable(){
          public void run(){
          panel.setTxtTiempo(segundos);
          }
          });
      }//while
   }//fin
    
    
    public void detener()
    {
        activo = false;
        interrupt();
    }   //fin detener 
    
    
    public void reiniciar () 
    {
        segundos=0;
        SwingUtilities.invokeLater(new Runnable(){
          public void run(){
          panel.setTxtTiempo(segundos);
          }
          });
        
    }
    
    
    
}









