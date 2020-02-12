package disenioSeleccion;
import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresar numero");
        int num = entrada.nextInt();
        Dia dia = new Dia(num);
        dia.calcularNombre();
        dia.obtenerNombre();
    }
}

