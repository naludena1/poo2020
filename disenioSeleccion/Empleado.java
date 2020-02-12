package disenioSeleccion;

public class Empleado {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;


    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    public double obtenerSueldo(){
        if (horas <= 40){
            sueldo = horas * cuota;
        }else{
            if (horas >= 40){
                sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            }
        }
        return sueldo;
    }

    public String presentarSalida(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nHoras Trabajadas: %d\nValor por hora: %.2f\nSueldo: %.2f",
                nombre, horas, cuota, obtenerSueldo());
        return cadena;
    }
}
