package polimorfismoPoo;

public abstract class Empleado12 {
    protected String nombre;
    protected String depart;
    protected String puesto;
    protected double sueldo;

    // Metodo abstracto
    public abstract void calcularSueldoQuinc();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
