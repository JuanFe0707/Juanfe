/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajospoo;
import java.util.Scanner;
/**14. Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
de selección múltiple dentro de otra.
 *Código Estudiante: 20241221242
 * @author JUAN FELIPE SIERRA YUNDA
 */
public class SwitchAutos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de carro:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        int tipoCarro = scanner.nextInt();

        String tipoSeleccionado = "";
        switch (tipoCarro) {
            case 1:
                tipoSeleccionado = "Auto";
                break;
            case 2:
                tipoSeleccionado = "SUV";
                break;
            case 3:
                tipoSeleccionado = "Camioneta";
                break;
            default:
                System.out.println("Selección inválida");
                return;
        }

        System.out.println("Seleccione el color del carro:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        int colorCarro = scanner.nextInt();

        String colorSeleccionado = "";
        switch (colorCarro) {
            case 1:
                colorSeleccionado = "Negro";
                break;
            case 2:
                colorSeleccionado = "Blanco";
                break;
            case 3:
                colorSeleccionado = "Rojo";
                break;
            default:
                System.out.println("Selección inválida");
                return;
        }

        System.out.println("Has seleccionado un " + tipoSeleccionado + " de color " + colorSeleccionado);
    }
}



    
