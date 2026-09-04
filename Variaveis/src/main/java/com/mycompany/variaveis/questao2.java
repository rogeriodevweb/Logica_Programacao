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
public class questao2 {
    public static void main(String[] args) {
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);        
        Scanner entradaLogica = new Scanner(System.in);
        
        int idade;
        
        Scanner entradaInt = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = entradaNumero.nextInt();
        
        
        System.out.println("Voce tem " + idade + " anos.");
        
    }
}