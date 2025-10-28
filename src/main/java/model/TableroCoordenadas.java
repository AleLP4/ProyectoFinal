package model;

/**
 *
 * @author Alessandro
 */
public class TableroCoordenadas 
{
    private int indice;
    private Coordenadas [] recorrido={
    
        
        //indicar coordenadas
        new Coordenadas(294,460 ), // 1
        new Coordenadas(294,437 ), // 2
        new Coordenadas(294,416 ), // 3
        new Coordenadas(294 ,393), // 4
        new Coordenadas(294,368), // 5 
        new Coordenadas(294,344 ), // 6
        new Coordenadas(294 ,324 ), // 7 
        new Coordenadas(294 ,299 ), // 8
        new Coordenadas(307 ,284 ), // 9
        new Coordenadas(331 ,284 ), // 10


        new Coordenadas(353,284), // 11
        new Coordenadas(377,284), // 12
        new Coordenadas(401,284), // 13
        new Coordenadas( 424,284), // 14
        new Coordenadas(448,284), // 15
        new Coordenadas(471,284), // 16
        new Coordenadas(471,231), // 17
        new Coordenadas(471,175), // 18
        new Coordenadas(448,175), // 19 
        new Coordenadas(424,175), // 20


        new Coordenadas( 401,175), // 21
        new Coordenadas(377,175), // 22
        new Coordenadas(353,175), // 23
        new Coordenadas(331,175), // 24
        new Coordenadas(307,175), // 25
        new Coordenadas(294 ,163), // 26
        new Coordenadas(294 ,139), // 27
        new Coordenadas(294 ,116), // 28
        new Coordenadas(294 ,92), // 29
        new Coordenadas(294 ,69), // 30


        new Coordenadas(294 ,46), // 31 
        new Coordenadas(294 ,23), // 32
        new Coordenadas(294 ,0), // 33
        new Coordenadas(239,0), // 34
        new Coordenadas(185,0), // 35
        new Coordenadas(185,23), // 36
        new Coordenadas(185,46), // 37
        new Coordenadas(185,69), // 38
        new Coordenadas(185,92), // 39
        new Coordenadas(185,116), // 40

        new Coordenadas(185,139), // 41
        new Coordenadas(185,163), // 42
        new Coordenadas(172,176), // 43
        new Coordenadas(148,176), // 44
        new Coordenadas(125,176), // 45
        new Coordenadas(101,176), // 46
        new Coordenadas(78,176), // 47
        new Coordenadas(55,176), // 48
        new Coordenadas(31,176), // 49
        new Coordenadas(8,176), //50

        new Coordenadas(8,229), // 51
        new Coordenadas(8,284), // 52
        new Coordenadas(31,284), // 53
        new Coordenadas(55,284), // 54
        new Coordenadas(78,284), // 55
        new Coordenadas(101,284), // 56
        new Coordenadas(125,284), // 57
        new Coordenadas(148,284), // 58
        new Coordenadas(172,284), // 59
        new Coordenadas(186,300), // 60


        new Coordenadas(186,323), // 61
        new Coordenadas(186,346), // 62
        new Coordenadas(186,369), // 63
        new Coordenadas(186,394), // 64
        new Coordenadas(186,416), // 65
        new Coordenadas(186,440), // 66
        new Coordenadas(186,463), // 67
        new Coordenadas(239,463), // 68
       
        //las posiciones en java serian del 0 al 67.
        
    };
    
    private int salida_Amarillo = 5 ;
    private int salida_Azul = 22 ;
    private int salida_Rojo = 39 ;
    private int salida_verde = 56 ;

    
    private Coordenadas caminoWin [][] = new Coordenadas [][]{
        {
            //estos son ejemplos faltan las cordenadas
            new Coordenadas(186,440), // 66
            new Coordenadas(186,463), // 67
            new Coordenadas(239,463) // 68
        },
        {
            new Coordenadas(186,440), // 66
            new Coordenadas(186,463), // 67
            new Coordenadas(239,463) // 68
        },
        {
            new Coordenadas(186,440), // 66
            new Coordenadas(186,463), // 67
            new Coordenadas(239,463) // 68
        },
        {
            new Coordenadas(186,440), // 66
            new Coordenadas(186,463), // 67
            new Coordenadas(239,463) // 68
        } };//fin caminoWin
    
    
    public Coordenadas [] metas = new Coordenadas []
    {
        //esto es un ejemplo falta ponerlas
            new Coordenadas(186,440), // 66
            new Coordenadas(186,463), // 67
            new Coordenadas(239,463) // 68
            //son 4
    };//fin metas
    
    public int getCasillasTotal ()
    {
        return recorrido.length;
    }//fin getCasillasTotal
    
    public Coordenadas getPosicion (int indiceGeneral)
    {
        return recorrido[indiceGeneral];
    }//fin getPosicion

    public Coordenadas[] getRecorrido() 
    {
        return recorrido;
    }//fin get recorrido
    
    //lee el tamaño y avanza segun caminoWin
    public int getAvanzarFicha (int colorId)
    {
        return caminoWin[colorId].length;
    }//fin avanzar
    
    public void reiniciar ()
    {
        indice = 0;
    }//fin reiniciar
    
    
    public Coordenadas getMetas (int colorId)
    {
        return metas[colorId];
    }//fin getMetas
    
    public Coordenadas getCaminoWin (int colorId, int step)
    {
        
        return caminoWin[colorId][step];
        
    }//fin getCamino
    
    
    
    
    
    
}//fin TableroCoordenadas
