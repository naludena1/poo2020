package taller1;

public class EjecutaEstudiante {
    public static void main(String[]args){
        //creacion de objeto
        Estudiante estudiante = new Estudiante();

        estudiante.actualizar_nombre("Karla");
        estudiante.actualizar_apellido("Cajas");
        estudiante.actualizar_nacionalidad("ecuatoriana");
        estudiante.actualizar_edad(20);
        estudiante.actualizar_genero("femenino");

        String mostrar_nombre = estudiante.obtener_nombre();
        System.out.println(mostrar_nombre);

        String mostrar_apellido = estudiante.obtener_apellido();
        System.out.println(mostrar_apellido);

        String mostrar_nacionalidad = estudiante.obtener_nacionalidad();
        System.out.println(mostrar_nacionalidad);

        int mostrar_edad = estudiante.obtener_edad();
        System.out.println(mostrar_edad);

        String mostrar_genero = estudiante.obtener_genero();
        System.out.println(mostrar_genero);

        estudiante.estudiar();

    }
}

