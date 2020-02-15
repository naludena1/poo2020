// Integrantes: Nohelia L, Diana S.
package taller_repeticion;

public class MultiplicacionVariosNumeros {
    private int numero1;
    private int numero2;
    private int result = 0;


    public MultiplicacionVariosNumeros(int num1, int num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public int obtenerResultado(){
        int cont = 0;
        while (cont < numero2){
            result = result + numero1;
            cont = cont + 1;
        }
        return result;
    }

}

