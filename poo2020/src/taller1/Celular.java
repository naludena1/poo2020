package taller1;

public class Celular {
    //definicion de atributos
    private String tamaño;
    private String modelo;
    private String color;
    private String sistema_operativo;
    private float capacidad;


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

    public String obtener_sistemaOperativo() {
        return this.sistema_operativo;

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

    public void actualizar_sistemaOperativo(String sistema_operativo) {
        this.sistema_operativo= sistema_operativo;

    }

    public void actualizar_capacidad(float capacidad) {
        this.capacidad = capacidad;

    }

    public void comunicarse(){
        System.out.println("el celular tiene como funcion la comunicacion");
    }

}
