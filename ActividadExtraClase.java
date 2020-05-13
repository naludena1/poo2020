
import java.util.Random;
public class ActividadExtraClase {
    public static void main(String[] args) {
        Random numAleatorio = new Random(System.currentTimeMillis());
        int[] values = new int[100];

        for (int i = 0; i < values.length; i++) {
            values[i] = numAleatorio.nextInt(500);
        }
        for (int j = 0; j < 10000000; j++) {
            int index = -1;

            for (int k = 0; k < values.length; k++) {
                if (values[k] == 80) {
                    index = k;

                    System.out.printf("Numero(%d) = %d \n", index, values[k]);
                }
            }
            break;

        }

    }
}
