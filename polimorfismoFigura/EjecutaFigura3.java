package polimorfismoFigura;
import java.util.Scanner;
public class EjecutaFigura3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String nombre;
        String cadena = "";
        double baseTriang, alturaTriang, areaTriang;
        double baseRec, alturaRec, areaRec;
        double lados, areaCua;
        double radio, areaCir;

        System.out.println("----------CALCULO DE AREAS DE LAS FIGURAS -----------");
        System.out.println("Ingrese el nombre de la figura: ");
        nombre = entrada.nextLine();
        nombre = nombre.toLowerCase(); // hago minusculas toda la cadena

        if (nombre.equals("triangulo")){
            entrada.nextLine();
            System.out.println("Ingrese la base del triangulo:");
            baseTriang = entrada.nextDouble();
            System.out.println("Ingrese altura del triangulo:");
            alturaTriang = entrada.nextDouble();

            Triangulo3 triangulo3 = new Triangulo3(baseTriang, alturaTriang, nombre);
            triangulo3.calcularArea();

            cadena = String.format("--RESULTADO--\nNombre Figura: %s\nBase: %.1f\nAltura: %.2f\nArea: %.2f",
                    nombre, baseTriang, alturaTriang, triangulo3.getArea());
        }else {
            if (nombre.equals("rectangulo")){
                entrada.nextLine();
                System.out.println("Ingrese la base del Rectangulo:");
                baseRec = entrada.nextDouble();
                System.out.println("Ingrese altura del Rectangulo:");
                alturaRec = entrada.nextDouble();

                Rectangulo3 rectangulo3 = new Rectangulo3(baseRec, alturaRec, nombre);
                rectangulo3.calcularArea();

                cadena = String.format("--RESULTADO--\nNombre Figura: %s\nBase: %.1f\nAltura: %.2f\nArea: %.2f",
                        nombre, baseRec, alturaRec, rectangulo3.getArea());
            }else {
                if (nombre.equals("cuadrado")){
                    entrada.nextLine();
                    System.out.println("Ingrese el valor de los lados del Cuadrado:");
                    lados = entrada.nextDouble();

                    Cuadrado3 cuadrado3 = new Cuadrado3(lados, nombre);
                    cuadrado3.calcularArea();

                    cadena = String.format("--RESULTADO--\nNombre Figura: %s\nLados: %.2f\nArea: %.2f",
                            nombre, lados, cuadrado3.getArea());
                }else {
                    if (nombre.equals("circulo") || nombre.equals("circulo")){
                        entrada.nextLine();
                        System.out.println("Ingrese el radio del circulo: ");
                        radio = entrada.nextDouble();

                        Circulo3 circulo3 = new Circulo3(radio,nombre);
                        circulo3.calcularArea();

                        cadena = String.format("--RESULTADO--\nNombre Figura: %s\nRadio: %.1f\nArea: %.2f",
                                nombre, radio, circulo3.getArea());
                    }else {
                        cadena = String.format("La Figura no está dentro de las opciones");
                    }
                }
            }
        }
        System.out.println(cadena); // imprimir cadena
    }
}
