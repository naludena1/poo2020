package herenciaFigura;

public class Rectangulo extends Figura {
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    public Rectangulo(String nombre, double baseRect,double alturaRect){
        this.nombreFig= nombre;
        this.baseRecta = baseRect;
        this.alturaRecta = alturaRect;
    }

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    public void calcularAreaR(){
        areaRecta = baseRecta *alturaRecta;
    }
    public double getR(){
        return areaRecta;
    }
}
