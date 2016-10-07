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
public class Ejer2Tema3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cantidad en euros");
        double euros = s.nextDouble() ;
        double pesetas ;
        pesetas = euros*166.386 ;
        
        System.out.println(euros+" € son = "+pesetas+" pts");
    }
}
