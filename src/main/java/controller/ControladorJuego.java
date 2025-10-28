package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import model.*;
import view.*;
/**
 *
 * @author Alessandro
 */
public class ControladorJuego implements ActionListener
{

    private GUIJuego gui;
    private PanelControl panelControl;
    private PanelTablero panelTablero;
    
    //clases de cordenadas
    private TableroCoordenadas tablero;
    private CoordenadasHome home;
    private  Ficha jugador;
    private Ficha oponente;
    
    private int colorJugadorId,colorOponenteId;
    
    private Random random = new Random();
    private Colores colores = new Colores();
    private Dado dado = new Dado(random,0);

    public ControladorJuego(PanelControl panelControl, PanelTablero panelTablero, int pColorJugadorId) {
        this.panelControl = panelControl;
        this.panelTablero = panelTablero;
        this.colorJugadorId = colorJugadorId;
        
        tablero = new TableroCoordenadas();
        home = new CoordenadasHome();
        colorJugadorId = pColorJugadorId;
        if(colorJugadorId < 0)
        {
           colorJugadorId = 0; 
        }//fin if 
        if (colorJugadorId>3)
        {
            colorJugadorId=3;
        }//fin if 2
        
        
        if(colorJugadorId== 0)
        {
            pColorJugadorId = 1;
        }else if(colorJugadorId == 1)
        {
            pColorJugadorId= 0;
        }else if(colorJugadorId == 2)
        {
            pColorJugadorId= 3;
        }else if(colorJugadorId == 3)
        {
            pColorJugadorId= 2;
        }
        
        jugador = new Ficha(colorJugadorId);
        oponente = new Ficha(pColorJugadorId);
        
        panelControl.getBtnDado().addActionListener(this);
        panelControl.getBtnReinicio().addActionListener(this);
        
        
        Coordenadas cJugador = home.getHome(colorJugadorId);
        Coordenadas cOponente = home.getHome(colorJugadorId);
        panelTablero.moverFicha(colorJugadorId,cJugador.getX(),cJugador.getY());
        panelTablero.moverFicha(colorJugadorId,cOponente.getX(),cOponente.getY());

        panelControl.setTextoTurno("Turno:" + new Colores().idAtexto(colorJugadorId));
        } //fin metodo constructor
    
    
    
    
public void actionPerformed(ActionEvent e)
{
    
}//fin
    
}//fin ControladorJuego
