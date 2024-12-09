import java.util.Scanner;

public class SalarioTrabajador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int horasTrabajadas;
        double valorHoraNormal, salario;

        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        valorHoraNormal = scanner.nextDouble();

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * valorHoraNormal;
        } else if (horasTrabajadas <= 48) {
            salario = (40 * valorHoraNormal) + ((horasTrabajadas - 40) * valorHoraNormal * 2);
        } else {
            salario = (40 * valorHoraNormal) + (8 * valorHoraNormal * 2) + 
                      ((horasTrabajadas - 48) * valorHoraNormal * 3);
        }

        System.out.printf("El trabajador %s recibirá: $%.2f%n", nombre, salario);

        scanner.close();
    }
}