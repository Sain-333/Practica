
package practica;

import java.util.Scanner;


public class Practica {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1,numero2,resultado;
        
        System.out.print("Digite el primer numero:");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el segundo numero:");
        numero2 = entrada.nextInt();
        
        resultado = numero1 + numero2;
        
        System.out.println("El resultado es: "+resultado);
        
    }
    
}
