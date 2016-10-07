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
public class Ejer11Tema3 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -CONVERSOR KB A MB- \n\n");
        System.out.print("Introduce una cantidad en KB: "); 
        int kb = Integer.parseInt(s.nextLine()); 
   
        int mb = kb / 1024;
        System.out.println("\nSi has introducido "+kb+
                           " KB, esto equivale a: "+mb+" MB");
        
    }
}
