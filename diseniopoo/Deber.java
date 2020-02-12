package diseniopoo;

public class Deber {
    private String nombre;
    private String materia;
    private double notaBim1;
    private double notaBim2;

    public Deber(String nombre, String materia, Double notaBim1, Double notaBim2) {
        this.nombre = nombre;
        this.materia = materia;
        this.notaBim1 = notaBim1;
        this.notaBim2 = notaBim2;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNotaBim1() {
        return notaBim1;
    }

    public void setNotaBim1(double notaBim1) {
        this.notaBim1 = notaBim1;
    }

    public double getNotaBim2() {
        return notaBim2;
    }

    public void setNotaBim2(double notaBim2) {
        this.notaBim2 = notaBim2;
    }

    public double nota_final(){
        double nota = notaBim1 + notaBim2;
        return nota;
    }
    public String mensaje_final(){
        String mensaje = "";
        if(nota_final()>= 28){
            mensaje = "Aprobado";
        }else{
            if (nota_final() <= 27) {
                mensaje = "Reprobado";
            }
        }
        return mensaje;
    }
    public String obtener_mensaje(){
        String salida = "Estudiante:-"+nombre+"\nMateria:-"+materia+"\nNota Primer Bimestre: "
                +notaBim1+"\nNota Segundo Bimestre: "+notaBim2+"\n" +
                "Nota: "+nota_final()+"\nEstado: "+mensaje_final();
        return salida;
     }
}
