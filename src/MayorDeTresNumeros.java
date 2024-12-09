import java.util.Scanner;

public class MayorDeTresNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1, num2, num3, mayor;
            System.out.println("Ingrese tres números enteros diferentes:");
            System.out.print("Primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Segundo número: ");
            num2 = scanner.nextInt();
            System.out.print("Tercer número: ");
            num3 = scanner.nextInt();
            // Encontrar el mayor
            mayor = num1;
            if (num2 > mayor) {
                mayor = num2;
            }   if (num3 > mayor) {
                mayor = num3;
            }   System.out.println("El mayor de los tres números es: " + mayor);
        }
    }
}