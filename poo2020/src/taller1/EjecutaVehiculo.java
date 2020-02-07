package taller1;

public class EjecutaVehiculo {
    //creacion de objeto
    public static void main(String[]args){
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.actualizar_modelo("Yaris");
        vehiculo.actualizar_color("negro");
        vehiculo.actualizar_tipo("deportivo");
        vehiculo.actualizar_marca("Toyota");
        vehiculo.actualizar_capacidad(4);

        String mostrar_modelo = vehiculo.obtener_modelo();
        System.out.println(mostrar_modelo);

        String mostrar_color = vehiculo.obtener_color();
        System.out.println(mostrar_color);

        String mostrar_tipo = vehiculo.obtener_tipo();
        System.out.println(mostrar_tipo);

        String mostrar_marca = vehiculo.obtener_marca();
        System.out.println(mostrar_marca);

        int mostrar_capacidad = vehiculo.obtener_capacidad();
        System.out.println(mostrar_capacidad);

        vehiculo.transportar();

    }
}
