/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SClassySubClass;

/**
 *
 * @author Maynor Molina
 */
public class Formas {
    private String Color;
    private String Nombre;
    private int Largo;
    private float Radio;
    private float Circunferencia;
    private float Base;
    private float Altura;
    private float ÁreaT;
    private float ÁreaC;
    private float Lado;
    
    
    public void establecerCircunferencia(float Circunferencia){
        this.Circunferencia = Circunferencia;
    }
    
    public void establecerBase(float Base){
        this.Base = Base;
    }
    
    public void establecerLado(float Lado){
        this.Lado = Lado;
    }
    
    public void establecerAltura(float Altura){
        this.Altura = Altura;
    }
    
    public float obtenerRadio(){
        Radio=(float) (Circunferencia/6.28);
        return Radio;
    }
    
    public float obtenerÁreaT(){
        ÁreaT=(float) (Base*Altura/2);
        return ÁreaT;
    }
    
    public float obtenerÁreaC(){
        ÁreaC=(float) (Lado*Lado*Lado*Lado);
        return ÁreaC;
    }
    
    public void establecerColor(String Color){
        this.Color = Color;
    }
    
    public void establecerLargo(int Largo){
        this.Largo = Largo;
    }
    
    public void establecerNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public void Dibujar(){
        if (Nombre == "Linea"){
            System.out.println("Esta figura es una: " + Nombre + "\n"+
                           "Su Color es: " + Color);
            System.out.println("Y su Largo es de: " + Largo + " cm");
        }else{
             System.out.println("Esta figura es un: " + Nombre + "\n"+
                           "Y su Color es: " + Color);
        }
    }
}
