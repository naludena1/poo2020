package herenciaFigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion ;
        double base,altura,lado,radio;

        do{
            System.out.println(" Escoga una opción : \n1.Area Triángulo " +
                    "\n2.Area Rectángualo: \n3. Area Cuadrado: \n4. Area Círculo");
            opcion= entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese el nombre de la figura");
            nombre = entrada.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la base del triángulo");
                    base = entrada.nextInt();
                    System.out.println("Ingrese la altura del triángulo");
                    altura= entrada.nextInt();
                    Triangulo tri = new Triangulo(nombre,base,altura);
                    tri.calcularAreaT();
                    System.out.println(" "+tri.getNombreFig()+ "\nSu área  es:"  +tri.getAreaTria());
                    break;
                case 2:
                    System.out.println("Ingrese la base del rectángulo");
                    base = entrada.nextInt();
                    System.out.println("Ingrese la altura del rectángulo");
                    altura= entrada.nextInt();
                    Rectangulo rec = new Rectangulo(nombre,base,altura);
                    rec.calcularAreaR();
                    System.out.println("%s"+rec.getNombreFig()+ "\n\tSu área  es:"  +rec.getR());
                    break;
                case 3:
                    System.out.println("Ingrese la medida de un lado del cuadrado");
                    lado = entrada.nextInt();
                    Cuadrado cua = new Cuadrado(nombre,lado);
                    cua.calcularAreaCuadrado();
                    System.out.println("%s"+cua.getNombreFig()+ "\n\tSu área  es:"  +cua.getAreaCuadrado());
                    break;
                case 4:
                    System.out.println("Ingrese el radio del circulo");
                    radio = entrada.nextInt();
                    Circulo cir = new Circulo(nombre,radio);
                    cir.calcularAreaC();
                    System.out.println("%s"+cir.getNombreFig()+ "\n\tSu área  es:"  +cir.getA());
                    break;

            }

        }while (opcion!=5);
    }

}
