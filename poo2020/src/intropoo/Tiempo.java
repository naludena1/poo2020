package intropoo;

public class Tiempo {


        //definicion de atributos
        private int hora;
        private int minuto;
        private int segundo;
        /*
         *Metodo para obtener el valor de la variable hora
         * @return this.hora
         */

    public int obtener_Hora() {
        return this.hora;
    }
         /*
         *Metodo para obtener el valor de la variable minuto
         * @return this.minuto
         */

        public int obtener_Minuto() {
            return this.minuto;
        }
        /*
         *Metodo para obtener el valor de la variable segundo
         * @return this.segundo
         */

        public int obtener_Segundo() {
            return this.segundo;
        }
        /*
         *Metodo para obtener el tiempo hh:mm:ss
         * @return tiempo
         */
        public String obtener_Tiempo() {
            String tiempo = hora+":"+minuto+":"+segundo;
            return tiempo;
        }
        /*
         *Metodo para actualizar la variable hora
         * @param hora
         */
        public void actualizar_Hora(int hora) {
            //con el this hacemos referencia a variables globales
            this.hora = hora;

        }
        /*
         *Metodo para actualizar la variable minuto
         * @param minuto
         */
        public void actualizar_Minuto(int minuto) {
            this.minuto = minuto;

        }

        /*
         *Metodo para actualizar la variable segundo
         * @param segundo
         */
        public void actualizar_Segundo(int segundo) {
            this.segundo = segundo;

        }
    }

