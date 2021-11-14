/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author 54117
 */
public class Prueba1 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);  // Se crea objeto Scanner
        System.out.println("==================================");
        System.out.println("Bienvenido, ingrese su nombre para");
        System.out.println("comenzar.");
        System.out.println("==================================\n");
        String Name = var.nextLine(); 
        System.out.println("\n==================================");
        System.out.println("Ahora ingrese su Apellido");
        System.out.println("==================================\n");
        String Surname = var.nextLine();
        System.out.println("\n==================================");
        System.out.println("Continuemos con su edad");
        System.out.println("==================================\n");
        int Age = var.nextInt();
        var.nextLine();
        
        System.out.println("\n==================================");
        System.out.println("Sigamos con unas preguntas simples");
        System.out.println("==================================\n");
        
        System.out.println("==================================");
        System.out.println("Cual es tu hobby preferido?");
        System.out.println("==================================\n");
        String watdo = var.nextLine();
        System.out.println("\n==================================");
        System.out.println("Que editor de codigo utilizas?");
        System.out.println("==================================\n");
        String CodeP = var.nextLine();
        System.out.println("\n==================================");
        System.out.println("En que sistema operativo trabajas?");
        System.out.println("==================================\n");
        String OS = var.nextLine();
        System.out.println("\n==================================\n");
        System.out.println("Verifique su informacion por favor\n");
        System.out.println("==================================");
        
        System.out.println("Nombre:            " + Name);
        System.out.println("Apellido:          " + Surname);
        System.out.println("Edad:              " + Age);
        System.out.println("Hobby:             " + watdo);
        System.out.println("Editor de Codigo:  " + CodeP);
        System.out.println("Sistema operativo: " + OS);
        System.out.println("==================================");
    }
    
}
