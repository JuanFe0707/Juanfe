/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospoo;
import java.util.Scanner;

/**
 *
 * @author JUAN FELIPE SIERRA YUNDA
 * Código Estudiante: 20241221242 
 */
/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/
/* Ejercicio número 1*/
public class Computadoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de computadoras: ");
        int numeroDeComputadoras = scanner.nextInt();
        double precioPorComputadora = 500.0;
        double descuento = 0.0;
        double precioTotal = numeroDeComputadoras * precioPorComputadora;

        if (numeroDeComputadoras < 5) {
            descuento = 0.10;
        } else if (numeroDeComputadoras >= 5 && numeroDeComputadoras < 10) {
            descuento = 0.20;
        } else if (numeroDeComputadoras >= 10) {
            descuento = 0.40;
        }

        double montoDescuento = precioTotal * descuento;
        double precioFinal = precioTotal - montoDescuento;

        System.out.println("Número de computadoras: " + numeroDeComputadoras);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto de descuento: $" + montoDescuento);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }
}
