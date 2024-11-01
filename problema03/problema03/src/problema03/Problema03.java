/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombrescompl;
        String direccion;
        double minutos;
        double costomin;
        double total_cancelar;
        
        System.out.println("Ingrese nombres completos del dueño de la linea");
        nombrescompl = entrada.nextLine();
        System.out.println("Ingrese la direccion ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese costo por minutos");
        costomin = entrada.nextDouble();
        System.out.println("Ingrese numero de minutos consumidos al mes");
        minutos = entrada.nextDouble();
        
        total_cancelar = costomin * minutos;
        
        System.out.printf("Reporte : \nNombres completos : %s\n\t"
                + "Direccion : %s\nCosto por minutos: %.2f\n\t"
                + "Numero de minutos consumidos : %.2f\n\t\t"
                + "Valor a cancelar : %.2f",
                nombrescompl,
                direccion,
                costomin,
                minutos,
                total_cancelar);    
    }
    
}
