package taller1;

public class EjecutaUniversidad {
    //creacion de objeto
    public static void main(String[]args){
        Universidad universidad = new Universidad();

        universidad.actualizar_nombre("UTPL");
        universidad.actualizar_ubicacion("Loja");
        universidad.actualizar_infraestructura("educativa");
        universidad.actualizar_tipo_univ("privada");
        universidad.actualizar_calificacion("A");

        String mostrar_nombre = universidad.obtener_nombre();
        System.out.println(mostrar_nombre);

        String mostrar_ubicacion = universidad.obtener_ubicacion();
        System.out.println(mostrar_ubicacion);

        String mostrar_infrastructura = universidad.obtener_infraestructura();
        System.out.println(mostrar_infrastructura);

        String mostrar_tipo_univ = universidad.obtener_tipo_univ();
        System.out.println(mostrar_tipo_univ);

        String mostrar_calificacion = universidad.obtener_calificacion();
        System.out.println(mostrar_calificacion);

        universidad.ofrecer_estudio();
        universidad.ofrecer_trabajo();
    }
}
