import java.util.Scanner; 
public class IncentivosEmpresa { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        // Datos de entrada 
        System.out.print("Ingrese las ventas del Departamento 1: "); 
        double ventasDepto1 = scanner.nextDouble(); 
        System.out.print("Ingrese las ventas del Departamento 2: "); 
        double ventasDepto2 = scanner.nextDouble(); 
        System.out.print("Ingrese las ventas del Departamento 3: "); 
        double ventasDepto3 = scanner.nextDouble(); 
  
        System.out.print("Ingrese el salario mensual de los vendedores: "); 
        double salarioBase = scanner.nextDouble(); 
        // Cálculo de las ventas totales 
        double ventasTotales = ventasDepto1 + ventasDepto2 + ventasDepto3; 
        double porcentajeLimite = ventasTotales * 0.33; // 33% de las ventas totales 
        // Cálculo de incentivos para cada departamento 
        double incentivoDepto1 = ventasDepto1 > porcentajeLimite ? salarioBase * 0.2 : 0; 
        double incentivoDepto2 = ventasDepto2 > porcentajeLimite ? salarioBase * 0.2 : 0; 
        double incentivoDepto3 = ventasDepto3 > porcentajeLimite ? salarioBase * 0.2 : 0; 
  
        // Salarios finales incluyendo incentivos 
        double salarioFinalDepto1 = salarioBase + incentivoDepto1; 
        double salarioFinalDepto2 = salarioBase + incentivoDepto2; 
        double salarioFinalDepto3 = salarioBase + incentivoDepto3; 
  
        // Datos de salida 
        System.out.println("\n--- Salarios Finales por Departamento ---"); 
        System.out.println("Departamento 1: $" + String.format("%.2f", salarioFinalDepto1)); 
        System.out.println("Departamento 2: $" + String.format("%.2f", salarioFinalDepto2)); 
        System.out.println("Departamento 3: $" + String.format("%.2f", salarioFinalDepto3)); 
    } 
} 
