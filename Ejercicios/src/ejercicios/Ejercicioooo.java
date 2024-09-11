/*19. Un centro penitenciario tiene N internos registrados y requiere un reporte con el nombre y la
condena (en meses) de los internos con menos de 36 meses de condena. También debe mostrar
la cantidad de internos que cumplen con dicha condición.
@20241220676 */
package ejercicios;
      
import java.util.Scanner;

public class Ejercicioooo {
     public static void main(String[] args) {
         // Solicitar el número de internos
         try ( // Crear un objeto Scanner para leer los datos del usuario
                 Scanner scanner = new Scanner(System.in)) {
             // Solicitar el número de internos
             System.out.print("Ingrese el número total de internos: ");
             int numInternos = scanner.nextInt();
             // Arreglos para almacenar los nombres y condenas de los internos
             String[] nombres = new String[numInternos];
             int[] condenas = new int[numInternos];
             // Ingresar los datos de los internos
             for (int i = 0; i < numInternos; i++) {
                 System.out.println("Interno #" + (i + 1));
                 System.out.print("Nombre: ");
                 scanner.nextLine(); // Consumir la línea anterior
                 nombres[i] = scanner.nextLine();
                 System.out.print("Condena (en meses): ");
                 condenas[i] = scanner.nextInt();
             }    // Contador de internos con condena menor a 36 meses
             int contador = 0;
             // Mostrar el reporte de los internos con menos de 36 meses de condena
             System.out.println("\nInternos con menos de 36 meses de condena:");
             for (int i = 0; i < numInternos; i++) {
                 if (condenas[i] < 36) {
                     System.out.println("Nombre: " + nombres[i] + " | Condena: " + condenas[i] + " meses");
                     contador++;
                 }
             }    // Mostrar la cantidad de internos con menos de 36 meses de condena
             System.out.println("\nCantidad de internos con menos de 36 meses de condena: " + contador);
             // Cerrar el escáner
         }
    }
}

