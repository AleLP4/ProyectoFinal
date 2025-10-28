package model;
/**
 *
 * @author Alessandro
 */
public class CoordenadasHome 
{
 
    private Coordenadas [] homes = new Coordenadas []
    {
        new Coordenadas (77,66),//roja
         new Coordenadas (401,391),//amarilla
        new Coordenadas (401,66),//azul
        new Coordenadas (77,391)//verde
       
    };
    
    /*private Coordenadas [] casaRoja = {new Coordenadas (77,66)};//fin

    private Coordenadas [] casaAzul = {new Coordenadas (401,66)};//fin
    
    private Coordenadas [] casaVerde = {new Coordenadas (77,391)};//fin
    
    private Coordenadas [] casaAmarilla = {new Coordenadas (401,391)};//fin
    */
    
    public Coordenadas getHome (int colorId)
    {
        if(colorId<0)
        {
            colorId=0;
        }
        
        
        
        if(colorId>3)
        {
            colorId= 3;
        }//fin
        
        return homes[colorId];
    }//fin metodo
    
}//fin CLASE
