package taller1;

public class EjecutaCelular {

        public static void main(String[]args){
            //creacion de objeto animal
            Celular celular = new Celular();
            celular.actualizar_capacidad(32);
            celular.actualizar_color("black");
            celular.actualizar_modelo("LG q7");
            celular.actualizar_sistemaOperativo("Android Oreo");
            celular.actualizar_tamaño("143.8x69.3x8.4mm");

            String mostrar_a = celular.obtener_tamaño();
            System.out.println(mostrar_a);

            String mostrar_b = celular.obtener_color();
            System.out.println(mostrar_b);

            String mostrar_c = celular.obtener_modelo();
            System.out.println(mostrar_c);

            String mostrar_d = celular.obtener_sistemaOperativo();
            System.out.println(mostrar_d);

            float mostrar_e = celular.obtener_capacidad();
            System.out.println(mostrar_e);

            celular.comunicarse();


        }

    }


