/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        String salida;
        String cadena = "";
        String cadenaE = "";
        int edad;
        double estatura;
        boolean condicion = true;
        int contador = 0; 
        double edades= 0;
        double estaturas= 0;
        double promedioE = 0;
        double promedioEs = 0;
        
        
        do{
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posicion del jugador");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad del jugador");
        edad = entrada.nextInt();
        System.out.println("Ingrese la estatura del jugador");
        estatura = entrada.nextDouble();
        contador = contador + 1;
        edades = edades + edad; 
        estaturas = estaturas + estatura;
        entrada.nextLine(); 
        
        cadena = (cadena + nombre + "-" + posicion +"-,edad " + edad + " estatura: "
                + estatura + "\n");;
        cadenaE = cadenaE + " | " + edad+ " | "; 
        System.out.println("Ingrese si para finalizar el proceso");
        salida = entrada.nextLine();
        if (salida.equals ("si")){
            condicion = false;
        }
        }

        while (condicion);
        
        promedioE = edades / contador;
        promedioEs = estaturas /contador;
        System.out.println("Listado de jugadores\n" + cadena);
        System.out.println("Listado de edades" + cadenaE);
        System.out.printf("Promedio de edades:  %.1f\n" , promedioE);
        System.out.printf("Promedio de estaturas:  %.2f\n" ,promedioEs);
        }
        
        
        
}
