package herenciaFigura;

public class Triangulo extends Figura {
    private double baseTrian;
    private double alturaTrian;
    private double areaTrian;

    public Triangulo(String nombre, double baseTrian, double alturaTrian) {
        this.nombreFig = nombre;
        this.setBaseTrian(baseTrian);
        this.setAlturaTrian(alturaTrian);
    }

    public double getBaseTrian() {
        return baseTrian;
    }

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public double getAlturaTrian() {
        return alturaTrian;
    }

    public void setAlturaTrian(double alturaTrian) {
        this.alturaTrian = alturaTrian;
    }

    public void calcularAreaT(){
        areaTrian = (baseTrian*alturaTrian)/2;
    }
    public double getAreaTria(){
        return areaTrian;
    }

}
