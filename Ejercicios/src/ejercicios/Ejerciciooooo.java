/*
 22.Un centro de salud cuenta con 1270 expedientes en su archivo y desea identificar a las personas
con mayor y menor peso. Para ello implementa un sistema mediante el cual se capturan el nombre
y peso de cada paciente y al finalizar, se imprime el nombre y kgs. de las personas con mayor y
menor peso.
@20241220676*/

package ejercicios;

import java.util.Scanner;

public class Ejerciciooooo {
     public static void main(String[] args) {
         
         try ( 
                 Scanner scanner = new Scanner(System.in)) {
             
             final int NUM_PACIENTES = 1270;
             
             String[] nombres = new String[NUM_PACIENTES];
             double[] pesos = new double[NUM_PACIENTES];
             
             for (int i = 0; i < NUM_PACIENTES; i++) {
                 System.out.println("Paciente #" + (i + 1));
                 System.out.print("Nombre: ");
                 nombres[i] = scanner.nextLine();
                 System.out.print("Peso (en kg): ");
                 pesos[i] = scanner.nextDouble();
                 scanner.nextLine(); 
             }    
             double mayorPeso = pesos[0];
             double menorPeso = pesos[0];
             String nombreMayorPeso = nombres[0];
             String nombreMenorPeso = nombres[0];
             
             for (int i = 1; i < NUM_PACIENTES; i++) {
                 if (pesos[i] > mayorPeso) {
                     mayorPeso = pesos[i];
                     nombreMayorPeso = nombres[i];
                 }
                 if (pesos[i] < menorPeso) {
                     menorPeso = pesos[i];
                     nombreMenorPeso = nombres[i];
                 }
             }    
             System.out.println("\nPaciente con mayor peso:");
             System.out.println("Nombre: " + nombreMayorPeso + " | Peso: " + mayorPeso + " kg");
             System.out.println("\nPaciente con menor peso:");
             System.out.println("Nombre: " + nombreMenorPeso + " | Peso: " + menorPeso + " kg");
             
         }
    }
}

