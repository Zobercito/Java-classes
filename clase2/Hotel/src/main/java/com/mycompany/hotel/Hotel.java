/*
Clase #2 - 05/09/2022
Programa que solicita cantidad personas adultas, cantidad de niños
y cantidad de dias de estadía

Calcular el importe a pagar + itbm, cosiderando que los adultos pagan tarifa
completa y los niños tarifa media

La entrada de teclado combina las clases BuferredReader, Scanner y la JOptionPane
*/
package com.mycompany.hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author franc
 */
public class Hotel {

    public static void main(String[] args) throws IOException {
        int cantadult, cantnino, numdias;
        String nomhotel, temp;
        float tarifa, subtotal, total;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Scanner teclado1 = new Scanner(System.in); 
        //Aquí se crea otro objeto para captura del teclado con la clase escaner
        
        //JOptionPane.showMessageDialog(null,″This is a message dialog box.″);
        
        System.out.println("Escribe el nombre del hotel: ");
        nomhotel = teclado.readLine();
        
        //System.out.println("Ingrese la cantidad de adultos: ");
        //cantadult = Integer.parseInt(teclado.readLine());
        //cantadult = teclado1.nextInt(); //Este objeto tiene un metodo para leer variables enteras directamente
        
        temp = JOptionPane.showInputDialog("Ingrese la cantidad de adultos: ");
        cantadult = Integer.parseInt(temp);
        
        System.out.println("Ingrese la cantidad de niños: ");
        cantnino = Integer.parseInt(teclado.readLine());
        
        System.out.println("Ingrese la cantidad de dias: ");
        numdias = Integer.parseInt(teclado.readLine());
        
        System.out.println("Ingrese la tarifa: ");
        //tarifa = Float.parseFloat(teclado.readLine());
        tarifa = teclado1.nextFloat();
        
        subtotal = (cantadult * numdias * tarifa) + (cantnino * numdias * tarifa/2);
        total = (float) (subtotal * 1.07);
        
        System.out.println("Su estadia en el hotel "+nomhotel);
        //System.out.println("Usted debe pagar: "+total);
        
        JOptionPane.showMessageDialog(null,"La cantidad a pagar es: "+total);
    }
}
