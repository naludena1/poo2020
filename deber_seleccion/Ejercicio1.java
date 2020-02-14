package deber_seleccion;

public class Ejercicio1 {
    private String nombre;
    private double calific1;
    private double calific2;
    private double calific3;
    private double calific4;

    public Ejercicio1(String nombre, double calific1, double calific2, double calific3, double calific4){
        this.nombre = nombre;
        this.calific1 = calific1;
        this.calific2 = calific2;
        this.calific3 = calific3;
        this.calific4 = calific4;
    }
    public double promediar(){
        double promedio;
        promedio = (calific1 + calific2 + calific3 + calific4) / 4;

        return promedio;
    }

    public String calificar(){
        String comentario = "";
        if (promediar() >= 60){
            comentario = "Aprovado";
        }else{
            if (promediar() < 60){
                comentario = "Reprovado";
            }
        }
        return comentario;
    }

    public String presentar(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nPromedio: %.2f\n%s\n", nombre, promediar(), calificar());
        return cadena;
    }
}
