package taller1;

public class EjecutaDocente {
    public static void main(String[]args){
        //creacion de objeto
        Docente docente = new Docente();

        docente.actualizar_nombre("Jhon");
        docente.actualizar_apellido("Snow");
        docente.actualizar_nacionalidad("Britanico");
        docente.actualizar_titulo("Arquitecto");
        docente.actualizar_genero("Masculino");

        String mostrar_nombre = docente.obtener_nombre();
        System.out.println(mostrar_nombre);

        String mostrar_apellido = docente.obtener_apellido();
        System.out.println(mostrar_apellido);

        String mostrar_nacionalidad = docente.obtener_nacionalidad();
        System.out.println(mostrar_nacionalidad);

        String mostrar_titulo = docente.obtener_titulo();
        System.out.println(mostrar_titulo);

        String mostrar_genero = docente.obtener_genero();
        System.out.println(mostrar_genero);

        docente.enseñar();

    }
}
