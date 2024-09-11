/*1. En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
package ejercicios;*/

import java.util.Scanner;

public class Ejercicio {
        public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        
        System.out.print("Ingrese su antigüedad en el empleo (en años): ");
        int antiguedad = scanner.nextInt();
        
        
        if (edad >= 60 && antiguedad < 25) {
            
            System.out.println("Usted califica para la jubilación por edad.");
        } else if (edad < 60 && antiguedad >= 25) {
            
            System.out.println("Usted califica para la jubilación por antigüedad joven.");
        } else if (edad >= 60 && antiguedad >= 25) {
            
            System.out.println("Usted califica para la jubilación por antigüedad adulta.");
        } else {
            
            System.out.println("Usted no califica para ninguna de las opciones de jubilación.");
        }
    }
}


