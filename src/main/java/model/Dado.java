package model;

import java.util.Random;

/**
 *
 * @author Alessandro
 */
public class Dado 
{

    private Random random;
    private int numero;

    public Dado(Random random, int numero) 
    {
        this.random = random;
        this.numero = numero;
    }//fin constructor
    
    
    public int tirada ()
    {
        numero= random.nextInt(6)+1;       
        return numero;
    }//fin tirada
    
    public int getValorActual ()
    {
        return numero;
    }//fin valorActual
}//fin
