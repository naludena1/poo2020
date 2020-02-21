package arreglosDeberPoo;

public class FichaEstudiantes {
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] univ = new String[5];
    private String[] celular = new String[5];

    public FichaEstudiantes (String[] nombre, int[] edad, String[] univ, String[] celular){
        this.nombre = nombre;
        this.edad = edad;
        this.univ = univ;
        this.celular = celular;
    }
}
