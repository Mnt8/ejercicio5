/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;
import java.util.Scanner;
/**
 *
 * @author Fabian
 */
public class Ejercicio_5 {

    /**
     *  Lee un número por teclado y muestra por consola, el carácter al que 
      pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me 
      muestre una a.
     */
    public static void main(String[] args) {
      Scanner scn= new Scanner (System.in);
      int numero = scn.nextInt();
      char assi = (char) numero;
      System.out.println("El caracter indicado es: " + assi);
    }
    
}
