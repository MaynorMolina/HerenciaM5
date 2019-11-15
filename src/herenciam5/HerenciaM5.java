/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciam5;

import SClassySubClass.Circulo;
import SClassySubClass.Cuadrado;
import SClassySubClass.Linea;
import SClassySubClass.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Maynor Molina
 */
public class HerenciaM5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        int n;
        
        System.out.println("Seleccione una operación: \n1. Calcular Radio de un Circulo\n" +
                           "2. Dibujar una Línea\n3. Calcular Área de un Triángulo\n4. " +
                           "Calcular Área de un Cuadrado\n0. Salir");
        n=teclado.nextInt();
        
        switch(n){
            case 1:
                System.out.println("\n");
                circulo.Dibujar();
                System.out.println("Su Radio es de: "+circulo.obtenerRadio());
            break; 
            case 2:
                System.out.println("\n");
                linea.Dibujar();
            break; 
            case 3:
                System.out.println("\n");
                triangulo.Dibujar();
                System.out.println("Su Área es de: "+triangulo.obtenerÁreaT());
            break; 
            case 4:
                System.out.println("\n");
                cuadrado.Dibujar();
                System.out.println("Su Área es de: "+cuadrado.obtenerÁreaC());
            break; 
            case 0:
                System.exit(0);
            break;
        }
        
    }
    
}
