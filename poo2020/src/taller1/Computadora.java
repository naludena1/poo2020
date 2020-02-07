package taller1;

public class Computadora {

    //definicion de atributos
    private String modelo;
    private String color;
    private String tamaño;
    private float capacidad;
    private String monitor;

    /*
     *Metodo para obtener el valor de las variables
     * @return this.variable
     */

    public String obtener_tamaño() {

        return this.tamaño;
    }

    public String obtener_modelo() {

        return this.modelo;
    }


    public String obtener_color() {

        return this.color;
    }

    public String obtener_monitor() {
        return this.monitor;

    }

    public float obtener_capacidad() {

        return this.capacidad;
    }

    /*
     *Metodo para actualizar las variables
     * @param especie
     */
    public void actualizar_tamaño(String tamaño) {
        //con el this hacemos referencia a variables globales
        this.tamaño = tamaño;

    }

    public void actualizar_modelo(String modelo) {
        this.modelo = modelo;

    }


    public void actualizar_color( String color) {
        this.color= color;

    }

    public void actualizar_capacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public void actualizar_monitor(String monitor) {
        this.monitor = monitor;

    }

    public void procesar() {
        System.out.println("su funcion es procesar informacion");;
    }
}
