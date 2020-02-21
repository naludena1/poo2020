package arreglosDeberPoo;
import java.util.Scanner;

public class EjecutaFichaEstudiantes {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombre = new String[3];
        int[] edad = new int[3];
        String[] univ = new String[3];
        String[] celular = new String[3];
        String presentar = "";

        for (int i = 0; i < nombre.length; i++) {
            System.out.printf("Ingrese el nombre del estudiante %d: ", i);
            nombre[i] = entrada.nextLine();
            System.out.printf("Ingrese la edad %d: ", i);
            edad[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Ingrese la Univerdad a la que pertenece el estudiante %d: ", i);
            univ[i] = entrada.nextLine();
            System.out.printf("Ingrese el numero de celular del estudiante %d: ", i);
            celular[i] = entrada.nextLine();
        }
        entrada.nextLine(); // limpieza de buffer de entrada

        FichaEstudiantes fichaEstudiantes = new FichaEstudiantes(nombre, edad, univ, celular);

        for (int j = 0; j < nombre.length; j++) {
            presentar = String.format("\n%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n", presentar,
                    nombre[j], edad[j], univ[j], celular[j]);
        }
        System.out.println(presentar);
    }
}