package arreglosDeberPoo;


public class VerificarCedula {
    private int cedula;
    private String estado;
    int val = 0;

    //Establecer y obtener datos
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getStatus() {
        return estado;
    }

    public void setStatus(String status) {
        this.estado = estado;
    }

    public VerificarCedula(int cedula){
        this.cedula = cedula;
    }
    //validacion de la cedula
    public void validacion() {
        int[] coeficientes = {2,1,2,1,2,1,2,1,2};
        estado = "Cédula incorrecta";

        // Arreglo para separar los valores de la cedula
        int[] cedulaArray = new int[10];
        int contador = 9;
        for (int i = 0; i < cedulaArray.length ; i++) {
            cedulaArray[contador] = (int)((cedula/Math.pow(10,i))%10);
            contador--;
        }
        int suma = 0;
        int result;
        for (int i = 0; i < (cedulaArray.length-1); i++){
            result = coeficientes[i] * cedulaArray[i];
            if (result > 9){
                result -= 9;
            }
            suma += result;
        }
        int residuo = suma%10;
        if(residuo != 0){
            val = 10 - residuo;
        }

        if(val == cedulaArray[9]){
            estado = "El número de cedula es correcto";
        }
    }
    public int obtenerCedula(){
        return cedula;
    }
    public int obtenerValidador(){
        return val;
    }
    public String obtenerEstado(){
        return estado;
    }
}
