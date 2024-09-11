/*13. Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
otra canasta, los premios se dan bajo la siguiente tabla:
HOMBRES MUJERES
# Bolita Premio # bolita Premio
1 Desodorante 1 Loción
2 Six-Pack de cerveza 2 Bikini
3 Camiseta 3 Crema para la cara
4 Pantaloneta 4 Plancha para el cabello
5 Sudadera 5 Esmalte de uñas
@20241220676*/
package ejercicios;

import java.util.Scanner;

public class Ejercicioo {
    
    public static void main(String[] args) {
        
      
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Ingrese su género (H para hombre, M para mujer): ");
            char genero = scanner.next().toUpperCase().charAt(0);
            
            if (genero == 'H' || genero == 'M') {
                
                System.out.print("Ingrese el número de la bolita que sacó (1-5): ");
                int numeroBolita = scanner.nextInt();
                
                
                if (numeroBolita >= 1 && numeroBolita <= 5) {
                    
                    if (genero == 'H') {
                        
                        switch (numeroBolita) {
                            case 1 -> System.out.println("Premio: Desodorante");
                            case 2 -> System.out.println("Premio: Six-Pack de cerveza");
                            case 3 -> System.out.println("Premio: Camiseta");
                            case 4 -> System.out.println("Premio: Pantaloneta");
                            case 5 -> System.out.println("Premio: Sudadera");
                        }
                    } else if (genero == 'M') {
                        
                        switch (numeroBolita) {
                            case 1 -> System.out.println("Premio: Loción");
                            case 2 -> System.out.println("Premio: Bikini");
                            case 3 -> System.out.println("Premio: Crema para la cara");
                            case 4 -> System.out.println("Premio: Plancha para el cabello");
                            case 5 -> System.out.println("Premio: Esmalte de uñas");
                        }
                    }
                } else {
                    System.out.println("El número de bolita debe estar entre 1 y 5.");
                }
            } else {
                System.out.println("El género ingresado es inválido. Ingrese H para hombre o M para mujer.");
            }
            
        }
    }
}


