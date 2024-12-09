import java.util.Scanner;

public class SalarioEmpleado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre;
            double salarioBasicoHora, salarioMensual;
            int horasTrabajadas;
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = scanner.nextLine();
            System.out.print("Ingrese el salario básico por hora: ");
            salarioBasicoHora = scanner.nextDouble();
            System.out.print("Ingrese el número de horas trabajadas en el mes: ");
            horasTrabajadas = scanner.nextInt();
            // Cálculo del salario mensual
            salarioMensual = salarioBasicoHora * horasTrabajadas;
            // Mostrar la información según la condición
            if (salarioMensual > 450000) {
                System.out.printf("Nombre: %s%n", nombre);
                System.out.printf("Salario mensual: $%.2f%n", salarioMensual);
            } else {
                System.out.printf("Nombre: %s%n", nombre);
            }
        }
    }
}