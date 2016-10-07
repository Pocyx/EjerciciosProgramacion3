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
public class Ejer12Tema3 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -Que nota debo sacar?- \n\n");
        System.out.print("Introduce la nota del primer examen: "); 
        double primerExamen = Double.parseDouble(s.nextLine()); 
        
        System.out.print("Introduce la nota que quiere sacar en el trimestre: "); 
        double trimestre = Double.parseDouble(s.nextLine()); 
   
        double segundoExamen = ( (trimestre*100) - (primerExamen*40) ) / 60;
        System.out.println("\nSi tu nota en el primer examen es "
                           +primerExamen+
                           " y la nota que le gustría sacar en el trimestre es: "
                           +trimestre+
                           "\nla nota que debe obtener en el segundo examen es: "
                           +segundoExamen);
        
    }
}
