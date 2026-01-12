/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author acharzari
 */
public class ArrayAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Random rnd = new Random();
        
        int n = 0;
        
        do {            
            System.out.print("Escribe un numero entero (1-20): ");
            n = sc.nextInt();
            
            if (n < 1 || n > 20) {
                System.out.println("Numero no valido (entre 1 y 20)");
            }
        } while (n < 1 || n > 20);
        
        
        double t[] = new double[n];
        
        double random = 0;
        double suma = 0;
             
        for (int i = 0; i < t.length; i++) {
            random = rnd.nextDouble(-5, 40);
            t[i] = random;
            suma += t[i];
        }
        
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Posicion %d: %.1f %n", i, t[i]);
        }
        
        double media = suma / t.length;
        System.out.printf("MEDIA: %.2f %n", media);
        
    }
    
}
