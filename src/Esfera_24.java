public class Esferas{ 
    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in); 
  
       // AQUÍ SE VAN A INGRESAR LOS PESOS 
        
        System.out.print("Introduza el peso de la esfera roja "); 
        double peso1 = scanner.nextDouble(); 
  
        System.out.print("Introduzca el peso de la esfera azul "); 
              double peso2 = scanner.nextDouble(); 
  
        System.out.print("Introduzca el peso de la esfera verde"); 
            double pesoC3= scanner.nextDouble(); 
  
         
//LOGICA PARA DETERMINAR EL PESO 
        
 if (peso1> peso2 && peso1 > peso3) { 
            System.out.println("La esfera roja es la más pesada."); 
        } else if (peso2 > peso1 && peso2 > peso3) { 
            System.out.println("La esfera azul es la más pesada."); 
        } else if (peso3 > peso1 && peso3 > peso2) { 
            System.out.println("La esfera verde es la más pesada."); 
        } else { 
            System.out.println("Hay esferas que tienen el mismo peso."); 
        } 
        scanner.close(); 
    } 
} 
