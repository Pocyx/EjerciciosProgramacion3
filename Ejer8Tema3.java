package EjerciciosProgramacion3;

import java.util.Scanner;
/**
 *
 * @author PocyxDesigner
 */
public class Ejer8Tema3 {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("      -TU SALARIO- \n\n");
        System.out.print("Introduce horas trabajadas: "); 
        int horasTrabajadas = Integer.parseInt(s.nextLine()); 
        System.out.print("Introduce salario por hora: "); 
        int salarioHora = Integer.parseInt(s.nextLine());
        int salarioTotal = horasTrabajadas * salarioHora;
        System.out.println("\nSi has trabajado "+horasTrabajadas+
                           " horas, tu salario será: "+salarioTotal+" €");
        
    }
}
