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
public class Ejer4Tema3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce dos numeros para mostrar "
                                            + "sus operaciones");
        int x = s.nextInt();
        int y = s.nextInt();
        
       int suma = x + y;
       int resta = x - y;
       int multiplicacion = x * y;
       double division = (double)x / y;
       double modulo = (double)x + y;
    
        System.out.println(x+" y "+y);
        System.out.println("La suma de "+x+" + "+y+" es "+suma);
        System.out.println("La resta de "+x+" - "+y+" es "+resta);
        System.out.println("La multiplicacion de "+x+" * "+y+" es "+multiplicacion);
        System.out.println("La division de "+x+" / "+y+" es "+division);
        System.out.println("El modulo de "+x+" % "+y+" es "+modulo);
    }
}
