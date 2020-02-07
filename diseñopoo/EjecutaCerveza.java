package diseñopoo;
import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("precio: ");
        double precio = teclado.nextDouble();
        System.out.println("Unidades vendidad: ");
        int unidades_vendidas = teclado.nextInt();

        //creacion de objeto tiempo
        Cerveza cerveza = new Cerveza(precio, unidades_vendidas, nombre, tipo);
        String mostrar_ventas = cerveza.presentar();
        System.out.println(mostrar_ventas);


    }

}
