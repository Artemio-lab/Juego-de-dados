/**
 * Write a description of class DadoView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DadoView
{
    private Square fondo;
    private Circle punto1;
    private Circle punto2;
    private Circle punto3;
    private Circle punto4;
    private Circle punto5;
    private Circle punto6;
    private Circle punto7;

    private int xPosition = 0;
    private int yPosition = 0;

    private int tamaño = 100;
    private int tamañoPunto = 20;

    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }
    public int getTamaño() {
        return tamaño;
    }
    public void moveTo(int x, int y) {
        xPosition = x;
        yPosition = y;
        acomodar();
    }
    public DadoView() {
        fondo = new Square();
        fondo.changeColor("black");
        punto1 = new Circle();
        punto2 = new Circle();
        punto3 = new Circle();
        punto4 = new Circle();
        punto5 = new Circle();
        punto6 = new Circle();
        punto7 = new Circle();
        
        acomodar();
    }
    
    public DadoView(int puntos) {
        fondo = new Square();
        fondo.changeColor("green");
        punto1 = new Circle();
        punto2 = new Circle();
        punto3 = new Circle();
        punto4 = new Circle();
        punto5 = new Circle();
        punto6 = new Circle();
        punto7 = new Circle();

        mostrarValor(puntos);
        acomodar();
    }
    
    public void cambiarColorFondo(String color){
        switch(color){
            case "red":
                fondo.changeColor(color);
                break;
            case "black":
                fondo.changeColor(color);
                break;
            case "green":
                fondo.changeColor(color);
                break;
            case "blue":
                fondo.changeColor(color);
                break;
            case "magenta":
                fondo.changeColor(color);
                break;
            case "yellow":
                fondo.changeColor(color);
                break;
            case "withe":
                fondo.changeColor(color);
                break;
            default:
                fondo.changeColor("black");
        }
        acomodar();
    }

    public void mostrarValor(int i) {
        if (i>=1 && i<=6) {
            esconder();
            fondo.makeVisible();
            switch(i) {
                case 1:
                    punto4.makeVisible();
                    break;
                case 2:
                    punto1.makeVisible();
                    punto7.makeVisible();
                    break;
                case 3:
                    punto1.makeVisible();
                    punto4.makeVisible();
                    punto7.makeVisible();
                    break;
                case 4:
                    punto1.makeVisible();
                    punto3.makeVisible();
                    punto5.makeVisible();
                    punto7.makeVisible();
                    break;
                case 5:
                    punto4.makeVisible();
                    punto1.makeVisible();
                    punto3.makeVisible();
                    punto5.makeVisible();
                    punto7.makeVisible();
                    break;
                case 6:
                    punto1.makeVisible();
                    punto2.makeVisible();
                    punto3.makeVisible();
                    punto5.makeVisible();
                    punto6.makeVisible();
                    punto7.makeVisible();
                    break;
            }
        }
    }

    public void acomodar() {

        fondo.moveTo(xPosition,yPosition);
        fondo.changeSize(tamaño);
        punto1.changeSize(tamañoPunto);
        punto2.changeSize(tamañoPunto);
        punto3.changeSize(tamañoPunto);
        punto4.changeSize(tamañoPunto);
        punto5.changeSize(tamañoPunto);
        punto6.changeSize(tamañoPunto);
        punto7.changeSize(tamañoPunto);

        int delta = tamaño/4;
        punto1.moveTo(xPosition + delta - tamañoPunto/2, yPosition + delta- tamañoPunto/2);
        punto2.moveTo(xPosition + delta - tamañoPunto/2, yPosition + delta * 2
            - tamañoPunto/2);
        punto3.moveTo(xPosition + delta - tamañoPunto/2, yPosition + delta * 3
            - tamañoPunto/2);

        punto4.moveTo(xPosition + delta * 2 - tamañoPunto/2, yPosition + delta * 2
            - tamañoPunto/2);

        punto5.moveTo(xPosition + delta * 3 - tamañoPunto/2, yPosition + delta- tamañoPunto/2);
        punto6.moveTo(xPosition + delta * 3 - tamañoPunto/2,yPosition + delta * 2
            - tamañoPunto/2);
        punto7.moveTo(xPosition + delta * 3 - tamañoPunto/2,yPosition + delta * 3
            - tamañoPunto/2);

    }

    public void esconder() {
        fondo.makeInvisible();
        punto1.makeInvisible();
        punto2.makeInvisible();
        punto3.makeInvisible();
        punto4.makeInvisible();
        punto5.makeInvisible();
        punto6.makeInvisible();
        punto7.makeInvisible();
    }

    public void mostrar() {
        fondo.makeVisible();
        punto1.makeVisible();
        punto2.makeVisible();
        punto3.makeVisible();
        punto4.makeVisible();
        punto5.makeVisible();
        punto6.makeVisible();
        punto7.makeVisible();
    }
}