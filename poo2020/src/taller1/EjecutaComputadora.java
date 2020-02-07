package taller1;

public class EjecutaComputadora {
    public static void main(String[]args){
        Computadora computadora = new Computadora();

        computadora.actualizar_capacidad( 32 );
        computadora.actualizar_color("violeta");
        computadora.actualizar_monitor("flex");
        computadora.actualizar_modelo("MacBook");
        computadora.actualizar_tamaño("13,3 pulgadas");

        String mostrar_a = computadora.obtener_tamaño();
        System.out.println(mostrar_a);
        String mostrar_b = computadora.obtener_color();
        System.out.println(mostrar_b);
        String mostrar_c = computadora.obtener_modelo();
        System.out.println(mostrar_c);
        String mostrar_d = computadora.obtener_monitor();
        System.out.println(mostrar_d);
        float mostrar_e = computadora.obtener_capacidad();
        System.out.println(mostrar_e);

        computadora.procesar();

    }
}
