import java.util.Scanner;

class EsferaDiferente {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Entrada de datos
       System.out.println("Ingrese el peso de la esfera A:");
       int pesoA = scanner.nextInt();
       System.out.println("Ingrese el peso de la esfera B:");
       int pesoB = scanner.nextInt();
       System.out.println("Ingrese el peso de la esfera C:");
       int pesoC = scanner.nextInt();
       System.out.println("Ingrese el peso de la esfera D:");
       int pesoD = scanner.nextInt();

       // Determinación de la esfera diferente
       if (pesoA == pesoB && pesoA == pesoC) {
           // D es diferente
           if (pesoD > pesoA) {
               System.out.println("La esfera D es la diferente y es de mayor peso.");
           } else {
               System.out.println("La esfera D es la diferente y es de menor peso.");
           }
       } else if (pesoA == pesoB && pesoA == pesoD) {
           // C es diferente
           if (pesoC > pesoA) {
               System.out.println("La esfera C es la diferente y es de mayor peso.");
           } else {
               System.out.println("La esfera C es la diferente y es de menor peso.");
           }
       } else if (pesoA == pesoC && pesoA == pesoD) {
           // B es diferente
           if (pesoB > pesoA) {
               System.out.println("La esfera B es la diferente y es de mayor peso.");
           } else {
               System.out.println("La esfera B es la diferente y es de menor peso.");
           }
       } else {
           // A es diferente
           if (pesoA > pesoB) {
               System.out.println("La esfera A es la diferente y es de mayor peso.");
           } else {
               System.out.println("La esfera A es la diferente y es de menor peso.");
           }
       }

       scanner.close();
   }
}
