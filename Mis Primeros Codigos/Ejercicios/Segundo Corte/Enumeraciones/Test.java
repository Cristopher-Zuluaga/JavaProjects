/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeraciones.Test;
import enumeraciones.*;
public class Test {

    public static void main(String[] args) {
        System.out.println(Dias.Domingo);
        System.out.println(Dias.Viernes);
        
        System.out.println(Continentes.America);
        System.out.println(Continentes.America.getPaises());
        
        Continentes continente = Continentes.America;
        System.out.println(continente.getPaises());
    }
    
}
