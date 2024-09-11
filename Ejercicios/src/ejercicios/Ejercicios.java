
package ejercicios;
/*8.En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
//del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.

@20241220676
*/
import java.util.Scanner;


public class Ejercicios {


    public static void main(String[] args) {
        
     double precioComputadora = 500;
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el número de computadoras que desea comprar: ");
        int numeroComputadoras = scanner.nextInt();
        
        
        double totalCompra = numeroComputadoras * precioComputadora;
        
        
        double descuento = 0;
        
        
        if (numeroComputadoras < 5) {
            descuento = 0.10; 
        } else if (numeroComputadoras >= 5 && numeroComputadoras < 10) {
            descuento = 0.20; 
        } else if (numeroComputadoras >= 10) {
            descuento = 0.40; 
        }
        
        
        double montoDescuento = totalCompra * descuento;
        
        
        double totalPagar = totalCompra - montoDescuento;
        
        
        System.out.println("Total antes del descuento: U$" + totalCompra);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto del descuento: U$" + montoDescuento);
        System.out.println("Total a pagar: U$" + totalPagar);
    }
}