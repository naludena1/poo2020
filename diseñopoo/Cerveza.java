
package diseñopoo;

public class Cerveza {
    private String nombre;
    private String tipo;
    private double precio;
    private int unidades_vendidas;

    // Se crea el constructor
    public Cerveza (double precio, int unidades_vendidas, String tipo, String nombre) {
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.tipo = tipo;
        this.nombre = nombre;
    }



    // Creacion de metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public double calcularVentas(){
        double totalVentas = precio * unidades_vendidas;
        return totalVentas;

    }
    public String presentar(){
        String cadena = String.format("-----------------------------\nCerveza: %s\nTipo: %s\nPrecio: %.2f\n" +
                "Unidades Vendidas: %d\n\nTOTAL VENTAS: $ %.2f\n-----------------------------" +
                "", nombre, tipo, precio, unidades_vendidas, calcularVentas());
        return cadena;
    }
}
