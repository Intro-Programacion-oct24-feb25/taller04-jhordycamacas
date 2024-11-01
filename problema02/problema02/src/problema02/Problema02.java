/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String primerhijo;
        String segundohijo;
        String tercerhijo;
        double gastos1;
        double gastos2;
        double gastos3;
        double totalgastos;
        
        System.out.println("Ingrese el nombre del primer hijo");
        primerhijo = entrada.nextLine();
        System.out.println("Ingrese los gastos del primer hijo");
        gastos1 = entrada.nextDouble();
        System.out.println("Ingrese el nombre del segundo hijo");
        entrada.nextLine();
        segundohijo = entrada.nextLine();
        System.out.println("Ingrese gastos del segundo hijo");
        gastos2 = entrada.nextDouble();
        System.out.println("Ingrese nombre del tercer hijo");
        entrada.nextLine();
        tercerhijo = entrada.nextLine();
        System.out.println("Ingrese gastos del tercer hijo");
        gastos3 = entrada.nextDouble();
        
        totalgastos = gastos1 + gastos2 + gastos3;
        
        System.out.printf("Nombre del primer hijo : %s\n"
        + "Gastos primer hijo : %.2f\nNombre del segundo hijo : %s\n"
        + "Gastos segundo hijo : %.2f\nNombre del tercer hijo : %s\n"
        + "Gastos tercer hijo : %.2f\nEl total de gastos es : %.2f",
                primerhijo,
                gastos1,
                segundohijo,
                gastos2,
                tercerhijo,
                gastos3,
                totalgastos);
        
    }
    
}
