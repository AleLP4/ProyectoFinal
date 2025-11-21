package model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */
public class Dado 
{

    private Random random;
    private int numero;

    public Dado() 
    {
        random = new Random();
    }//fin constructor
    
    
    public int tirada ()
    {
        numero= random.nextInt(6)+1;   
        JOptionPane.showMessageDialog(null,"Saco " + numero);
        return numero;
    }//fin tirada
    
    public int getValorActual ()
    {
        return numero;
    }//fin valorActual
}//fin
