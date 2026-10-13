import java.util.Scanner;

public class ejemplofuncionesString {
    public static void main(String[] args) {
        int edad = 18;
        String modeloCoche = "Corsa", frase = "", oracion = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase = teclado.nextLine();

        // Para saber la cantidad de caracteres un String se usa la funcion length
        System.out.println("El modelo de coche tiene: " + modeloCoche.length() + " caracteres");

        /**
         * con tolowercase se pasan a minusculas y con touppercasa se pasa a mayusculas
         */
        System.out
                .println("En mayusculas " + modeloCoche.toUpperCase() + " en minusculas " + modeloCoche.toLowerCase());

        // Para sacar el carecter que esta en la posicion c se usa charAt
        char caracter = modeloCoche.charAt(1);
        System.out.println("El caracter e n la posicion 1 es " + caracter + " ya que empieza en la posicion 0");
        // Trim eleminia los espacios al principio y al final de una cadena
        modeloCoche = modeloCoche.trim();
        // Contains devuelve true si la cadena contiene la palabra que le metemos
        boolean contieneMar = frase.toLowerCase().contains("mar");

        if (contieneMar == true) {
            System.out.println(" La frase tiene la palabra mar");
        } else
            System.out.println(" La frase no tiene la palabra mar");

        int posicion = frase.indexOf("coche");
        // Indexor me dice la posicion donde se encuentra la primera palabra buscada
        // Si despues de la palabra buscada ponemos un numero, busca a partir de esa
        // posicion
        System.out.println(" La palabra coche esta en la posicion " + frase.toLowerCase().indexOf("coche"));

        /**
         * con substring cortamos un String dando una posicion inicial y final
         * nos devuelve un nuevo String
         */
        oracion = frase.substring(5, 10);
        System.out.println("el corte es: " + oracion);

        // Ejemplo para la primera frase finalizada con "."
        oracion = frase.substring(0, frase.indexOf(".") + 1);
        System.out.println("la frase es: " + oracion);

        // Cambiamos una palabra por otra
        frase = frase.replace("oracion", "oración");

        System.out.println("la frase cambiada es: " + frase);

        teclado.close();
    }
}
