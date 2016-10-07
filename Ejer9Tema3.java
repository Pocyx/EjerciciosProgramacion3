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
public class Ejer9Tema3 {
    public static void main(String[] args) {
        
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -VOLUMEN DE UN CONO- \n\n");
        System.out.print("Introduce la altura del cono: "); 
        double h = Double.parseDouble(s.nextLine()); 
        System.out.print("Introduce el radio: "); 
        double r = Double.parseDouble(s.nextLine());
        double volumen = ( 0.3 * 3.14 * r * r * h);
        //double volumen = ((1/3));
        System.out.println("\nSi la altura es "+naranja+h+" y el radio "+verde+r+
                           ", \nel volumen será: "+azul+volumen+".");
        
        
        
    }
}
