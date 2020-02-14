package deber_seleccion;

public class Ejercicio3 {

    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int numMayor;

    public Ejercicio3(int numero1, int numero2, int numero3, int numero4){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
    }

    public int calcularNumMayor(){
        if (numero1 > numero2 && numero1 > numero3 && numero1 >  numero4){
            numMayor = numero1;
        }else{
            if (numero2 > numero3 && numero2 > numero4){
                numMayor = numero2;
            }else{
                if (numero3 > numero4){
                    numMayor = numero3;
                } else {
                    numMayor= numero4;
                }
            }
        }
        return numMayor;
    }

    public String obtenerNumeroMayor(){
        String cadena = "";
        cadena = String.format("\nEl numero mayor es: %d", calcularNumMayor());
        return cadena;
    }
}
