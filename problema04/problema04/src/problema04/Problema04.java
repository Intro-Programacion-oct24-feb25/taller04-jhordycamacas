/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        String nombre;
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        double total;
        
        System.out.println("Ingrese nombres completos del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese monto del cpu");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese monto del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese monto del ratón");
        raton = entrada.nextDouble();
        System.out.println("Ingrese monto de la pantalla");
        pantalla = entrada.nextDouble();
        
        total = cpu + teclado + raton + pantalla;
        
                
    }
    
}
