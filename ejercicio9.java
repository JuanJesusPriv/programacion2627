import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("Di un número: ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        teclado.close();
    }
}
