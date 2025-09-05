
/**
 * Write a description of class JuegoDado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JuegoDado
{
    Dado dado1, dado2, dado3;
    DadoView d1,d2,d3;
    
    public JuegoDado(){
        dado1 = new Dado();
        d1 = new DadoView();
        d1.moveTo(100,150);
        dado2 = new Dado();
        d2 = new DadoView();
        d2.moveTo(250,150);
        dado3 = new Dado();
        d3 = new DadoView();
        d3.moveTo(400,150);
    }
    
    public void lanzarDados(){
        d1.mostrarValor(dado1.lanzar());
        d2.mostrarValor(dado2.lanzar());
        d3.mostrarValor(dado3.lanzar());
    }
    
    public boolean sonLos3Iguales(){
        boolean son3Iguales = false;
        if(dado1.getCaraActual() == dado2.getCaraActual() && dado1.getCaraActual()== dado3.getCaraActual()){
            son3Iguales=true;
        }
        return son3Iguales;
    }
    
    public int cantidadPuntos(){
        return dado1.getCaraActual()+dado2.getCaraActual()+dado3.getCaraActual();
    }
    
    public boolean obtenerGanador(){
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        if(sonLos3Iguales() || cantidadPuntos()>14){
            System.out.println("Haz ganado");
            return true;
        }else{
            System.out.println("Haz perdido");
            return false;
        }
    }
}
