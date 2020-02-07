package taller1;

public class EjecutaAnimal {

    public static void main(String[]args){
        //creacion de objeto
        Animal animal = new Animal();

        animal.actualizar_alimentacion("carnivoro");
        animal.actualizar_clasificacion("felido");
        animal.actualizar_especie("Leon");
        animal.actualizar_reproduccion("mamifero");
        animal.actualizar_peso(190);

        String mostrar_especie = animal.obtener_especie();
        System.out.println(mostrar_especie);
        String mostrar_alimentacion = animal.obtener_alimentacion();
        System.out.println(mostrar_alimentacion);
        String mostrar_clasificacion = animal.obtener_clacificacion();
        System.out.println(mostrar_clasificacion);
        String mostrar_reproduccion = animal.obtener_reproduccion();
        System.out.println(mostrar_reproduccion);
        float mostrar_peso = animal.obtener_peso();
        System.out.println(mostrar_peso);

        animal.alimentarse();
        animal.reproducirse();

    }
}

