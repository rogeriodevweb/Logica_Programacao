/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author RogerioSilva
 */
public class questao7 {
    public static void main(String[] args) {
        
       String nome;
       int idade;
       double altura;
       
       
       Scanner entradaTexto = new Scanner (System.in);
       
       System.out.println("Digite seu nome: ");
       nome = entradaTexto.nextLine();
        
       
       Scanner entradaNumero = new Scanner (System.in);
       
       System.out.println("Digite sua idade: ");
       idade = entradaNumero.nextInt();
        

       Scanner entrada = new Scanner(System.in);

       System.out.println("Digite sua altura: ");
       altura = entrada.nextDouble();
         
        
       
       System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos e a sua altura é " + altura);

 
        
        
        
        
    }
}
