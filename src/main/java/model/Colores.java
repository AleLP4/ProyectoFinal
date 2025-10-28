package model;
/**
 *
 * @author Alessandro
 */
public class Colores 
{

    private int rojo= 0;
    private int amarillo= 1;
    private int azul = 2;
    private int verde = 3;
    
    public String idAtexto (int id)
    {
        switch(id)
        {
            case 0 :
               return "Rojo";
           
            case 1 :
               return "Amarillo";
            
            case 2 :
               return "Azul";
            
            case 3 :
               return "Verde"; 
           
            default:
                return "Rojo";
        }//fin switch
    }//fin metodo

public int textoAid (String nombre)
{
    if(nombre.equalsIgnoreCase("Rojo"))
    {
        return 0;
    }//fin if
    if(nombre.equalsIgnoreCase("Amarillo"))
    {
        return 1;
    }//fin if
    if(nombre.equalsIgnoreCase("Azul"))
    {
        return 2;
    }//fin if
    if(nombre.equalsIgnoreCase("Verde"))
    {
        return 3;
    }//fin if

    return 0;
}//fin metodo
    
}//fin clase
