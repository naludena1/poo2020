// Integrantes: Nohelia L, Diana S.
package taller_repeticion;

public class Factorial {
    private int numero;

    public  Factorial(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public int calcularFactorial(){
        int fact = 1;
        for(int i = 1; i<=numero; i++){
            fact = fact*i;
        }
        return fact;
    }
}
