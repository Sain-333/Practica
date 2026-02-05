
package practica;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Practica {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1,numero2,operacion,resultado;
        
        System.out.print("Digite el primer numero:");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el segundo numero:");
        numero2 = entrada.nextInt();
        
        operacion = Integer.parseInt(JOptionPane.showInputDialog("Digite una operacion: \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar \n"
                + "4. Dividir "));
        
        
        switch (operacion) {
            case 1: resultado = numero1+numero2;
                System.out.println("La suma es: "+resultado);
                break;
            
            
        }
        
        
        
        
        
    }
    
}
