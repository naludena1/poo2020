package taller1;

public class Vehiculo {
    //definicion de atributos
    private String modelo;
    private String color;
    private String tipo;
    private String marca;
    private int capacidad;

    /*
     *Metodo para obtener el valor de las variables
     * @return this.variable
     */

    public String obtener_modelo() {
        return this.modelo;
    }

    public String obtener_color() {
        return this.color;
    }

    public String obtener_tipo() {
        return this.tipo;
    }
    public String obtener_marca() {
        return this.marca;

    }
    public int obtener_capacidad() {
        return this.capacidad;
    }
    /*
     *Metodo para actualizar las variables
     * @param especie
     */
    public void actualizar_modelo(String modelo) {
        //con el this hacemos referencia a variables globales
        this.modelo = modelo;

    }

    public void actualizar_color(String color) {
        this.color = color;

    }


    public void actualizar_tipo( String tipo) {
        this.tipo = tipo;

    }

    public void actualizar_marca(String marca) {
        this.marca = marca;

    }

    public void actualizar_capacidad(int capacidad) {
        this.capacidad = capacidad;

    }

    public void transportar() {
        System.out.println("Transporte");
    }


}


