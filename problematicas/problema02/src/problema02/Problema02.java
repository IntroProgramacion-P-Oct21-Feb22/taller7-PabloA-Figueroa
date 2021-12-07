/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero1;
        int numero2= 0;
        int contador= 0;
        String cadena = "";
        
        System.out.println("Ingrese el numero de valores a generar");
        numero1= entrada.nextInt();
        while (contador <= numero1){
            contador = contador + 1;
            numero2= numero2 + (contador * 2);
            cadena= cadena + numero2 + " ";
        }
        System.out.println("cadena:" + cadena);
    }
    
    
}
