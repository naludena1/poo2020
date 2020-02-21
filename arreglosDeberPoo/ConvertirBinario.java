package arreglosDeberPoo;
import java.lang.Math;

public class ConvertirBinario {
    private String numbin;
    private int result;

    public ConvertirBinario (String binario){
        this.numbin = binario;
    }

    public int[] convertir(){
        int[] nums = new int[numbin.length()];
        for(int i=0; i < numbin.length(); i++){
            nums[i] = Character.getNumericValue(numbin.charAt(i));
        }
        return nums;
    }

    public int convertirBinario(){
        int elevado;
        for (int j=0; j < convertir().length; j ++){
            elevado = (int) Math.pow(2, j);
            result = result + (convertir()[j] * elevado);
        }
        return result;
    }
}
