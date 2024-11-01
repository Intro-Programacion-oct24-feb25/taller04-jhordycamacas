/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       double netflix;
       double youtube;
       double dropbox;
       double spotify;
       double promonetflix;
       double promoyoutube;
       double promodropbox;
       double total;
       
       System.out.println("Ingrese precio a pagar de netflix");
       netflix = entrada.nextDouble();
       System.out.println("Ingrese precio a pagar de Youtube Premium");
       youtube = entrada.nextDouble();
       System.out.println("Ingrese precio a pagar de dropbox");
       dropbox = entrada.nextDouble();
       System.out.println("Ingrese precio a pagar de spotify");
       spotify = entrada.nextDouble();
       
       promonetflix = netflix * 0.77;
       promoyoutube = youtube * 0.77;
       promodropbox = dropbox * 0.55;
       total = promonetflix + promoyoutube + promodropbox + spotify;
       
       System.out.printf("Reporte: \n"
       + "Costo de netflix: $%.2f\n"
       + "Porcentaje de descuento en netflix : 23 \n"
       + "Costo de youtube premium: $%.2f\n"
       + "Porcentaje de descuento en youtube premium : 23 \n"
       + "Costo de dropbox: $%.2f\n"
       + "Porcentaje de descuento en dropbox : 45 \n"
       + "Costo de spotify: $%.2f\n"
       + "Pago mensual de servicios digitales es: $%.2f",
               promonetflix,
               promoyoutube,
               promodropbox,
               spotify,
               total);
    }
    
}
