package deber_seleccion;

public class Ejercicio2 {
    private String nombre;
    private int horas;
    private double valor;
    private double sueldo;

    public Ejercicio2(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.valor = cuota;
    }
    public double obtenerSueldo(){
        if (horas <= 50){
            sueldo = horas * valor;
        }else{
            if (horas >= 50){
                sueldo = (50 * valor) + ((horas - 50) * (valor * 3));
            }
        }
        return sueldo;
    }

    public String presentar(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nHoras Trabajadas: %d\nValor por hora: %.2f\nSUELDO: %.2f",
                nombre, horas, valor, obtenerSueldo());
        return cadena;
    }
}
