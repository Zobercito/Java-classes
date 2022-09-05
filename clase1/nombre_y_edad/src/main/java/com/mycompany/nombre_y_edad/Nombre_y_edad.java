/*
Clase #1 - 09-02-2022

Programa que pregunte el nombre y edad de una persona y la imprima en pantalla

Para la entrada de edad se usa la clase parseInt
*/

package com.mycompany.nombre_y_edad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author franc
 */
public class Nombre_y_edad {

    public static void main(String[] args) throws IOException  {
        String nombre;
        int edad;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Por favor ingrese su nombre: ");
        nombre=teclado.readLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(teclado.readLine());
        
        System.out.println("\nSu nombre es "+nombre+" y su edad es de "+edad+" años.");
        
    }
}
