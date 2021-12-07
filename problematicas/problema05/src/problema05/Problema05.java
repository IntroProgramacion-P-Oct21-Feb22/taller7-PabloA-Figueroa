/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero1;
        int numero2= 1;
        int numero3 = 1;
        int contador= 1;
        String cadena = "";

        
        System.out.println("Ingrese el numero de valores a generar");
        numero1= entrada.nextInt();
       do{
            if (contador == 1){
            cadena = cadena + numero2 ;
            }
            numero3 = numero3  + 2;
            contador = contador + 1;
            if( contador % 2 == 0){
                cadena =  cadena + " -"+ numero2 + "/" + numero3 ; 
            } else{
            cadena =  cadena + " +"+ numero2 + "/" + numero3 ; 
            }
  
        }  while(contador<=numero1);
        System.out.println("cadena:" + cadena);
    
    
    

    }
    
}
