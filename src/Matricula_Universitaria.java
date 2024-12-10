import java.util.Scanner; 
 public class MatriculaUniversitaria { 
  
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
  
        // Datos de entrada 
        System.out.print("Ingrese el número de inscripción: "); 
        int numeroInscripcion = scanner.nextInt(); 
  
        scanner.nextLine(); // Limpiar el buffer 
  
        System.out.print("Ingrese el nombre del estudiante: "); 
        String nombres = scanner.nextLine(); 
  
        System.out.print("Ingrese el patrimonio del estudiante: "); 
        double patrimonio = scanner.nextDouble(); 
  
        System.out.print("Ingrese el estrato social del estudiante: "); 
        int estratoSocial = scanner.nextInt(); 
  
        // Cálculo de la matrícula 
        double costoBase = 50000; // Valor constante 
        double incremento = 0; 
  
        if (patrimonio > 2000000 && estratoSocial > 3) { 
            incremento = patrimonio * 0.03; 
        } 
  
        double pagoMatricula = costoBase + incremento; 
  
        // Datos de salida 
        System.out.println("\n--- Detalle de la Matrícula ---"); 
        System.out.println("Número de inscripción: " + numeroInscripcion); 
        System.out.println("Nombres: " + nombres); 
        System.out.println("Pago por matrícula: $" + String.format("%.2f", pagoMatricula)); 
    } 
} 
