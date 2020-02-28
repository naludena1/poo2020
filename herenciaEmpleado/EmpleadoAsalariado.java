package herenciaEmpleado;

public class EmpleadoAsalariado extends Empleado{
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double val_mensual){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.val_mensual = val_mensual;
    }

    // varibles
    private double val_mensual;

    // Métodos get y set
    public double getVal_mensual() {
        return val_mensual;
    }

    public void setVal_mensual(double val_mensual) {
        this.val_mensual = val_mensual;
    }
}
