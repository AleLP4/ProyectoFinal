/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author TI-IN
 */
public class Preguntas 
{

    private Random random = new Random();
    
    private String facil[][] = {
    {"Charli XCX es una cantante británica.", "v"},
    {"El nombre real de Charli XCX es Charlotte Emma Aitchison.", "v"},
    {"Charli XCX lanzó la canción 'Boom Clap'.", "v"},
    {"Charli XCX empezó su carrera musical en la infancia.", "v"},
    {"Charli XCX solo canta música clásica.", "f"},
    {"Charli XCX ha colaborado con Iggy Azalea.", "v"},
    {"Charli XCX es artista de rock pesado.", "f"}
    };

    private String medias[][] = {
    {"El álbum 'Brat' fue lanzado en 2024.", "v"},
    {"Charli XCX escribió canciones para otras artistas como Selena Gomez.", "v"},
    {"Charli XCX formó parte del grupo PC Music como miembro oficial.", "f"},
    {"Charli participó en la banda sonora de la película 'The Fault in Our Stars'.", "v"},
    {"La canción 'Unlock It' pertenece al álbum 'How I'm Feeling Now'.", "f"}, // es de POP 2
    {"Charli XCX trabajó con SOPHIE en varias canciones.", "v"},
    {"'Vroom Vroom' es una canción que inició su era hyperpop.", "v"}
    };

    private String dificiles[][] = {
    {"Charli XCX originalmente lanzó música en MySpace cuando era adolescente.", "v"},
    {"La canción '1999' fue producida únicamente por A. G. Cook.", "f"},
    {"Charli XCX canta una parte en japonés en alguna versión oficial de 'I Love It'.", "f"},
    {"'N1A' es un mixtape que salió antes de 'Pop 2'.", "v"},
    {"Charli XCX fue la encargada de componer completamente sola el álbum 'CRASH'.", "f"},
    {"El mixtape 'Pop 2' incluye una colaboración con Carly Rae Jepsen.", "v"}
    };
    
    
    //agregar 20 pre
    
    public boolean preguntasV (int dificultad)
    {

        String[][] banco;
        if(dificultad==1)
        {
            banco = facil;
        }else if(dificultad==2)
        {
            banco= medias;
        }else 
        {
            banco=dificiles;
        }
        
        int indice = random.nextInt(banco.length);
        String preguntas = banco[indice][0];
        String respuesta = banco[indice][1];
        
        String titulo = "Pregunta";
        
        int opcion = JOptionPane.showConfirmDialog(null,preguntas + "\n\n Seleccion: Si= verdadero, No = falso",titulo,JOptionPane.YES_NO_OPTION);
        
        String respuestaJugador;

        if(opcion== JOptionPane.YES_OPTION)
        {
            respuestaJugador="V";
        }
        else
        {
            respuestaJugador="F";
        }
        
        boolean correcta;
        if(respuestaJugador.equalsIgnoreCase(respuesta))
        {
            correcta = true;
        }
        else
        {
            correcta = false;
        }
        
        String mensaje = null;
        
        if(correcta)
        {
            if(dificultad==1)
            {
                mensaje= "Correcto\n Ganaste 1 punto :/";
            }
            if(dificultad==2)
            {
                mensaje= "Correcto\n Ganaste 2 punto :/";
            }
            if(dificultad==3)
            {
                mensaje= "Correcto\n Ganaste 3 punto :/";
            }
        }
        else
        {
            if(dificultad==1)
            {
                mensaje= "Incorrecto\n perdiste 1 punto >:)";
            }
            if(dificultad==2)
            {
                mensaje= "Incorrecto\n perdiste 2 punto >:";
            }
            if(dificultad==3)
            {
                mensaje= "Incorrecto\n perdiste 3 punto >:";
            }
        }
        //fin if        
        
        
        
        JOptionPane.showMessageDialog(null,mensaje);
        
        
        
        return correcta;
            
    }//fin preguntasV

    
}
