package arreglosDeberPoo;
import java.util.Scanner;

public class EjecutaConvertirBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numbin;
        int result;
        int tamanio;

        System.out.println("\nConvertir número binario a decimal");
        System.out.println("Ingrese el numero Binario: ");
        numbin = entrada.nextLine();

        ConvertirBinario ejercicio2 = new ConvertirBinario(numbin);
        tamanio = ejercicio2.convertir().length;
        result = ejercicio2.convertirBinario();
        System.out.printf("Tamaño del numero Binario: %d", tamanio);
        System.out.printf("\nEl numero en decimal es: %d", result);
    }
}
