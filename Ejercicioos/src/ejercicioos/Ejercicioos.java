/*
 2.b.2. Pedir por teclado dos fechas (indicando día, mes y año, en tres variables numéricas) y mostrar el
número de días que hay de diferencia. Suponiendo que estamos en un planeta donde todos los meses
son de 30 días, donde hay 12 meses por lo que los años tienen siempre 360 días. Suponer también que
la primera fecha es anterior a la segunda.
@20241220676  */
package ejercicioos;

import java.util.Scanner;

public class Ejercicioos {
 public static void main(String[] args) {
        
     try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Ingrese la primera fecha (anterior):");
         System.out.print("Día: ");
         int dia1 = scanner.nextInt();
         System.out.print("Mes: ");
         int mes1 = scanner.nextInt();
         System.out.print("Año: ");
         int anio1 = scanner.nextInt();
         
         
         System.out.println("Ingrese la segunda fecha (posterior):");
         System.out.print("Día: ");
         int dia2 = scanner.nextInt();
         System.out.print("Mes: ");
         int mes2 = scanner.nextInt();
         System.out.print("Año: ");
         int anio2 = scanner.nextInt();
         
         
         int totalDias1 = dia1 + (mes1 * 30) + (anio1 * 360);
         int totalDias2 = dia2 + (mes2 * 30) + (anio2 * 360);
         
         
         int diferenciaDias = totalDias2 - totalDias1;
         
         
         System.out.println("La diferencia entre las dos fechas es de " + diferenciaDias + " días.");
     }
    }
}

