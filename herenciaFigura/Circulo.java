package herenciaFigura;

public class Circulo extends Figura{
    private double radio;
    double area;

    public Circulo(String nombre, double radioC){
        this.nombreFig= nombre;
        this.radio = radioC;

    }

    public double getRadioC() {
        return radio;
    }

    public void setRadioC(double radioC) {
        this.radio = radioC;
    }

    public void calcularAreaC(){
        area = 3.14* Math.pow(radio,2);
    }
    public double getA(){
        return area;
    }
}