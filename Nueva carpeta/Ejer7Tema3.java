/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosProgramacion3;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer7Tema3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce tres cuantias de una factura\n");
        System.out.println("Introduce la 1ª: ");
        
        double x = s.nextInt();
        System.out.println("Introduce la 2ª ");
        double y = s.nextInt();
        System.out.println("Introduce la 3ª ");
        double z = s.nextInt();
        
       double total = x + y + z;
       double iva = total * 0.21;
       double totalIva = total + iva;
    
        System.out.println("Cuantia 1 = "+x+"\ncuantia 2 = "+y+"\ncuantia 3 = "+z);
        System.out.println("El total de la factura es: "+total);
        System.out.println("El total de la factura mas el iva es: "+totalIva);
    } 
}
