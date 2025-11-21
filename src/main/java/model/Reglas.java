package model;

/**
 *
 * @author Alessandro
 */
public class Reglas {

    private int totalCasillas = 68;
    private int[] salidas = new int[]{39, 4, 21, 55};
    private boolean entro = false;

    //rojo - 0
    //amarillo - 1
    //azul - 2
    //verde - 3
    private int[] entradas = new int[]{33, 67, 16, 50};

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public boolean salir(int dado) {
        return dado == 5;
    }//fin salir

    public int salidaId(int colorId) {
        return salidas[colorId];
    }//fin

    public boolean entradaWin(int colorId, int indiceRecorrido) {
        return indiceRecorrido == entradas[colorId];
    }//fin entrada win

    public int avanzar(int indice, int dado) {

        int i;

        if (dado > 0) {
            for (i = 0; i < dado; i++) {
                indice++;
            }//fin for

            if (indice == totalCasillas) {
                indice = 0;
            }//fin if
        }

        return indice;

    }//fin avanzar

    public boolean posicionEntrada(int colorId, int indice, int dado) {

        int i;
        if (dado > 0) {
            for (i = 0; i <= dado; i++) {
                indice++;

                if (dado >= totalCasillas) {
                    totalCasillas--;
                }//fin if
                if (dado == indice) {
                    return true;
                }//fin if
            }//fin for
                } else {
                    if (dado < 0) {
                        for (i = -1; i >= dado; i--) {
                            indice++;
                        }//fin for 2
                        if (dado < totalCasillas) {
                            totalCasillas++;
                        }//fin if
                        if (dado == indice) {
                            return true;
                        }
                    }

                }//fin if
                return false;
            

        }//fin posicionEntrada

    }//fin reglas 

    /*public boolean entrarAwin (int posicion, int colorId)
  {
      if(colorId==1)
      {
          if(posicion==entradas[1])
          {
              entro = true;
          }//fin if 2
      }//fin if1
      else
      {
             entro = false;
      }//fin else
      return entro;
  }//fin metodo*/

