public class Triangulo { 
    public static void main(String[] args) { 
        // Crear un objeto Scanner para leer los datos del usuario 
        Scanner scanner = new Scanner(System.in); 
  
        // Leer los tres lados del triángulo 
        System.out.print("Ingrese el lado a del triángulo: "); 
        double a = scanner.nextDouble(); 
  
        System.out.print("Ingrese el lado b del triángulo: "); 
        double b = scanner.nextDouble(); 
  
        System.out.print("Ingrese el lado c del triángulo: "); 
        double c = scanner.nextDouble(); 
  
        // Verificar si los lados forman un triángulo válido 
        if (a + b > c && a + c > b && b + c > a) { 
            // Calcular el semiperímetro 
            double s = (a + b + c) / 2; 
  
            // Calcular el área usando la fórmula de Herón 
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
  
            // Mostrar los resultados 
            System.out.println("El semiperímetro del triángulo es: " + s); 
            System.out.println("El área del triángulo es: " + area); 
        } else { 
            System.out.println("Los lados ingresados no forman un triángulo válido."); 
        } 
  
        // Cerrar el scanner 
        scanner.close(); 
    } 
} 
