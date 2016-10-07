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
public class Ejer5Tema3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la base y la altura de un rectangulo para calcular su area\n");
        System.out.println("Introduce la base ");
        
        int x = s.nextInt();
        System.out.println("Introduce la altura ");
        int y = s.nextInt();
        
       int area = x * y;
       
    
        System.out.println("Base = "+x+" y altura = "+y);
        System.out.println("El area de este rectangulo es: "+area);
    } 
}
