/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author RogerioSilva
 */
import java.util.Scanner;

public class questao12 { 
    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        String nome; 
        double numero1, numero2, resultado; 

        System.out.println("Digite seu nome: "); 
        nome = entrada.nextLine(); 

        System.out.println("Digite o primeiro numero decimal: "); 
        numero1 = entrada.nextDouble(); 

        System.out.println("Digite o segundo numero decimal: "); 
        numero2 = entrada.nextDouble(); 

        resultado = numero1 - numero2; 

        System.out.println(nome + ", o resultado da subtracao e: " + resultado); 

        entrada.close(); 
    } 
}