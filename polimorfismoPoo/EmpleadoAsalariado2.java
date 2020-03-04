package polimorfismoPoo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double sueldoMensual;

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }


    @Override
    public void calcularSueldoQuinc() {
        sueldo = sueldoMensual / 2;

    }
}
