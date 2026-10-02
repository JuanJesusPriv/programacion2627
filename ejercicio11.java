import java.util.Scanner;

public class ejercicio11 {
    // Realiza un programa un programa que lea
    // un sueldo bruto y los impuestos y devuelva un texto del tipo:
    // Cobras XXX pero hacienda se lleva xxx por lo cual te quedan unos miseros xxx.

    public static void main(String[] args) {

        double sueldo = 0;
        int impuesto = 0;
        double dinero_real = 0;

        System.out.print("Indica tu sueldo bruto: ");
        Scanner teclado = new Scanner(System.in);
        sueldo = teclado.nextDouble();

        System.out.print("Indica tu porcentaje de impuestos pagados: ");
        Scanner teclado2 = new Scanner(System.in);
        impuesto = teclado2.nextInt();

        dinero_real = sueldo - (sueldo * impuesto / 100);

        System.out.println("El dinero real que ganas es: " + dinero_real + " euros.");

        teclado.close();
        teclado2.close();
    }
}
