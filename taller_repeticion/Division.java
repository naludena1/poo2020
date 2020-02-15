// Integrantes: Nohelia L, Diana S.
package taller_repeticion;

public class Division {
    private int dividendo;
    private int divisor;
    int contador;

    public Division (int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void calcular_division (){
        for (contador = 0; dividendo >= divisor; contador++) {
            dividendo = dividendo - divisor;
        }
    }

    public int obteber_division () {
        return contador;
    }
}

