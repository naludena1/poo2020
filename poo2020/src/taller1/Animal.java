package taller1;

public class Animal {
    //definicion de atributos
    private String especie;
    private String reproduccion;
    private String clasificacion;
    private String alimentacion;
    private float peso;


    /*
     *Metodo para obtener el valor de las variables
     * @return this.variable
     */


    public String obtener_especie() {
        return this.especie;
    }

    public String obtener_reproduccion() {
        return this.reproduccion;
    }

    public String obtener_clacificacion() {
        return this.clasificacion;
    }
    public String obtener_alimentacion() {
        return this.alimentacion;

    }
    public float obtener_peso() {
        return this.peso;
    }
    /*
     *Metodo para actualizar las variables
     * @param especie
     */
    public void actualizar_especie(String especie) {
        //con el this hacemos referencia a variables globales
        this.especie = especie;

    }

    public void actualizar_reproduccion(String reproduccion) {
        this.reproduccion = reproduccion;

    }


    public void actualizar_clasificacion( String clasificacion) {
        this.clasificacion= clasificacion;

    }

    public void actualizar_alimentacion(String alimentacion) {
        this.alimentacion= alimentacion;

    }

    public void actualizar_peso(float peso) {
        this.peso = peso;

    }

    public void reproducirse(){
        System.out.println("Reproduccion del animal");
    }

    public void alimentarse() {
        System.out.println("Alimentacion");

    }

}
