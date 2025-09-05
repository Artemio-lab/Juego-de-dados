import java.util.Random;

/**
 * Write a description of class Dado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dado
{
    private int caras;
    private String colorDado;
    private String colorPuntos;
    private int caraActual;
    
    public Dado(){
        caras=6;
    }
    
    public Dado(int cantidadCaras){
        caras=cantidadCaras;
    }
    
    public int getCaras(){
        return caras;
    }
    
    public int lanzar(){
        Random rnd=new Random();
        caraActual=rnd.nextInt(6)+1;
        return caraActual;
        
    }
    
    public int getCaraActual(){
        return caraActual;
    }
    
    public String toString(){
        return "Cara actual: "+ caraActual;
    }
}
