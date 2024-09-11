/*14. Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
de selección múltiple dentro de otra.
@20241220676 */
package ejercicios;
import java.util.Scanner;

public class Ejerciciooo {
    
    public static void main(String[] args) {
        
        try ( 
                Scanner scanner = new Scanner(System.in)) {
           
            System.out.println("Seleccione el tipo de carro:");
            System.out.println("1. Auto");
            System.out.println("2. SUV");
            System.out.println("3. Camioneta");
            System.out.print("Opción: ");
            int tipoCarro = scanner.nextInt();
            
            switch (tipoCarro) {
                case 1 -> System.out.println("Ha seleccionado: Auto");
                case 2 -> System.out.println("Ha seleccionado: SUV");
                case 3 -> System.out.println("Ha seleccionado: Camioneta");
                default -> {
                    System.out.println("Opción no válida. Fin del programa.");
                    return;
                }   
            }
            System.out.println("Seleccione el color del carro:");
            System.out.println("1. Negro");
            System.out.println("2. Blanco");
            System.out.println("3. Rojo");
            System.out.print("Opción: ");
            int colorCarro = scanner.nextInt();
            
            switch (colorCarro) {
                case 1 -> {
                    switch (tipoCarro) {
                        case 1 -> System.out.println("Ha seleccionado un Auto color Negro.");
                        case 2 -> System.out.println("Ha seleccionado un SUV color Negro.");
                        case 3 -> System.out.println("Ha seleccionado una Camioneta color Negro.");
                    }
                }
                case 2 -> {
                    switch (tipoCarro) {
                        case 1 -> System.out.println("Ha seleccionado un Auto color Blanco.");
                        case 2 -> System.out.println("Ha seleccionado un SUV color Blanco.");
                        case 3 -> System.out.println("Ha seleccionado una Camioneta color Blanco.");
                    }
                }
                case 3 -> {
                    switch (tipoCarro) {
                        case 1 -> System.out.println("Ha seleccionado un Auto color Rojo.");
                        case 2 -> System.out.println("Ha seleccionado un SUV color Rojo.");
                        case 3 -> System.out.println("Ha seleccionado una Camioneta color Rojo.");
                    }
                }
                default -> System.out.println("Opción de color no válida.");
            }
            
        }
    }
}

