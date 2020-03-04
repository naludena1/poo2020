package polimorfismoPoo;

public class EmpleadoPorHoras2 extends Empleado12 {
    // Atributos propios de la clase
    private double horasTrabajadas;
    private double cuotaPorHora;

    // Tambien se extienden los atributos de la clase padre

    public void setHorasTrabajadas(double horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setCuotaPorHora(double cuotaPorHora) {
        this.cuotaPorHora = cuotaPorHora;
    }

    @Override
    public void calcularSueldoQuinc() {
        sueldo = horasTrabajadas * cuotaPorHora;

    }
}
