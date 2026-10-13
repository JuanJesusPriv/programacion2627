package UNIDAD2;

public class ejemploconversiones {
    public static void main(String[] args) {

        /*
         * Para convertir un numero que tiene como cadena de texto (String) a tipo
         * numero
         * usamos las funciones parse que tienen las clases de cada tipo de dato
         */
        String numeroTxt = " 34.23";
        double numero = Double.parseDouble("2.22");
        float peso = Float.parseFloat("60.8f");
        String nombre = "Jose";

        /**
         * Para convertir un numero a texto para insertarlo en cadenas o buscar
         * usamos
         */

        String potenciaStr = Integer.toString(234); // String.valueoff(234)

        if (nombre.equalsIgnoreCase("Jose")) {
            System.out.println("El nombre es igual a jose");
        }

    }
}
