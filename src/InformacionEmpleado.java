import java.util.Scanner;

public class InformacionEmpleado {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String codigo, nombres;
            int horasTrabajadas;
            double valorHora, porcentajeRetencion, salarioBruto, salarioNeto;
            System.out.print("Ingrese el código del empleado: ");
            codigo = scanner.nextLine();
            System.out.print("Ingrese los nombres del empleado: ");
            nombres = scanner.nextLine();
            System.out.print("Ingrese el número de horas trabajadas al mes: ");
            horasTrabajadas = scanner.nextInt();
            System.out.print("Ingrese el valor de la hora trabajada: ");
            valorHora = scanner.nextDouble();
            System.out.print("Ingrese el porcentaje de retención en la fuente (sin el símbolo %): ");
            porcentajeRetencion = scanner.nextDouble();
            // Cálculo del salario bruto
            salarioBruto = horasTrabajadas * valorHora;
            // Cálculo del salario neto (después de la retención)
            salarioNeto = salarioBruto - (salarioBruto * (porcentajeRetencion / 100));
            // Mostrar la información
            System.out.println("\nInformación del empleado:");
            System.out.println("Código: " + codigo);
            System.out.println("Nombres: " + nombres);
            System.out.printf("Salario Bruto: $%.2f%n", salarioBruto);
            System.out.printf("Salario Neto: $%.2f%n", salarioNeto);
        }
    }
}