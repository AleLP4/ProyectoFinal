package model;

/**
 *
 * @author Alessandro
 */
public class Ficha 
{
 
    private String colorNombre;
    private int salida,totalCasillas,indice,color,pasoWin;
    private boolean poseInicial;
    private boolean caminoWin;

    public Ficha(int pColor) 
    {
        //recordar que es atributo de la clase ficha - variable del constructor
        color = pColor;
        colorNombre = new Colores().idAtexto(pColor);
        this.salida = salida;
        this.totalCasillas = totalCasillas;
        indice = -1;
        poseInicial=true;
        caminoWin=true;
        pasoWin=0;
    }//fin constructor

   
    

    public String getColorNombre() {
        return colorNombre;
    }

    public int getSalida() {
        return salida;
    }

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public int getIndice() {
        return indice;
    }

    public int getColor() {
        return color;
    }

    public boolean isPoseInicial() {
        return poseInicial;
    }

    public boolean isCaminoWin() {
        return caminoWin;
    }

    public int isPasoWin() {
        return pasoWin;
    }

    public void setColorNombre(String colorNombre) {
        this.colorNombre = colorNombre;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPoseInicial(boolean poseInicial) {
        this.poseInicial = poseInicial;
    }

    public void setCaminoWin(boolean caminoWin) {
        this.caminoWin = caminoWin;
    }

    public void setPasoWin(int pasoWin) {
        this.pasoWin = pasoWin;
    }
    
    
    
    public void reset ()
    {
        indice = -1; pasoWin = 0; poseInicial = true; caminoWin=true;
    }
    
    
}//fin clase
