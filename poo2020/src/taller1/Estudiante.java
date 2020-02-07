package taller1;

public class Estudiante {
    //definicion de atributos
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;
    private String genero;


    public String obtener_nombre() {
        return this.nombre;
    }
    /*
     *Metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */

    public String obtener_apellido() {
        return this.apellido;
    }

    public String obtener_nacionalidad() {
        return this.nacionalidad;
    }
    public int obtener_edad() {
        return this.edad;

    }
    public String obtener_genero() {
        return this.genero;
    }
    /*
     *Metodo para actualizar las variables
     * @param especie
     */
    public void actualizar_nombre(String nombre) {
        //con el this hacemos referencia a variables globales
        this.nombre = nombre;

    }

    public void actualizar_apellido(String apellido) {
        this.apellido = apellido;

    }


    public void actualizar_nacionalidad( String nacionalidad) {
        this.nacionalidad = nacionalidad;

    }

    public void actualizar_edad(int edad) {
        this.edad = edad;

    }

    public void actualizar_genero(String genero) {
        this.genero = genero;

    }

    public void estudiar(){
        System.out.println("El estudiante cumple la funcion de estudiar");

    }



}


