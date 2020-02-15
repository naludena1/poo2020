// Integrantes: Nohelia L, Diana S.

package taller_repeticion;

import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreSocio;
        Double saldoInicial;
        boolean bandera = true;

        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su saldo actual:");
        double saldo = entrada.nextDouble();
        Cajero cajeroAutomatico = new Cajero(nombre,saldo);
        while(bandera == true) {
            System.out.println("\t\t|CAJERO AUTOMATICO|\nOPCIONES:\n Ingrese la opcion que desea realizar\n" +
                    "1: Consultar saldo actual\n2: Depositar dinero\n" +
                    "3: Retirar dinero\n");
            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    System.out.printf("Su saldo actual es de: %.2f\n", cajeroAutomatico.getSaldoInicial());
                    entrada.nextLine();
                    break;
                    case 2:
                        System.out.println("Ingrese la cantidad de dinero que desea depositar:");
                        double deposito = entrada.nextDouble();
                        double saldo_final = cajeroAutomatico.calcularSaldo(2, deposito);
                        entrada.nextLine();
                        cajeroAutomatico.setSaldoInicial(saldo_final);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dinero que desea retirar");
                        double retiro = entrada.nextDouble();
                        double saldo_final2 = cajeroAutomatico.calcularSaldo(3, retiro);
                        entrada.nextLine();
                        cajeroAutomatico.setSaldoInicial(saldo_final2);
                        break;
                        default:
                            System.out.println("OPCION INCORRECTA");
            }
            System.out.println("Desea realizar otra consulta?");
            String opcion = entrada.nextLine();
            if(opcion.equals("no")){
                bandera = false;
            }
        }
    }
}



