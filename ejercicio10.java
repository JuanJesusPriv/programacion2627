import java.util.Scanner;

public class ejercicio10 {

    // Realiza un programa que calcule el área de un círculo leyendo
    // por teclado los valores necesarios, tipo float.(Pantallazo funcionando y
    // código)

    public static void main(String[] args) {
        float radio = 0f;
        float pi = 3.141592f;
        float area = 0f;

        System.out.print("Indica el radio del circulo: ");
        Scanner teclado = new Scanner(System.in);
        radio = teclado.nextFloat();

        area = (radio = (float) Math.pow(radio, 2.00f) * pi);

        System.out.println("El area del circulo es: " + area);

        teclado.close();
    }
}
