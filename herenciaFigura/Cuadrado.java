package herenciaFigura;

public class Cuadrado extends Figura {
    private double ladoCuadrado;
    private double areaCuadrado;

    public Cuadrado(String nombre, double ladoCuadrado){
        this.nombreFig = nombre;
        this.ladoCuadrado = ladoCuadrado;
    }

    public Double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public void setBaseCuadrado(Double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }
    public void calcularAreaCuadrado(){
        areaCuadrado = Math.pow(ladoCuadrado,2);
    }
    public double getAreaCuadrado(){
        return areaCuadrado;
    }
}
