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
public class Ejer10Tema3 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -CONVERSOR MB A KB- \n\n");
        System.out.print("Introduce una cantidad en MB: "); 
        int mb = Integer.parseInt(s.nextLine()); 
   
        int kb = mb * 1024;
        System.out.println("\nSi has introducido "+mb+
                           " MB, esto equivale a: "+kb+" KB");
        
    }
}
