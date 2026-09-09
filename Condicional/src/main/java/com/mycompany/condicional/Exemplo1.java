/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author RogerioSilva
 */
public class Exemplo1 {
    public static void main(String[] args) {
        //Variaveis
        double altura, peso, imc;
        String nome;
        
        //Scanner
        Scanner entradaNumero= new Scanner(System.in);
        Scanner entradaTexto= new Scanner(System.in);
        
        //Solicitar dados do usuario
        System.out.println("Digite seu nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("Digite sua altura:");
        altura = entradaNumero.nextDouble();
        
        System.out.println("Digite seu peso:");
        peso = entradaNumero.nextDouble();
        
        //calcular IMC
        imc = peso / (altura*altura);
        
        //analizar o imc (if aninhado)
        if (imc <= 16.9) {
        System.out.println("Muito abaixo do peso!");
        } else if (imc >= 17 && imc <= 18.4) {
        System.out.println("Abaixo do peso!");
        } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Peso normal!");
        } else if (imc >= 25 && imc <= 29.9) {
        System.out.println("Acima do peso!");
        } else if (imc >= 30 && imc <= 34.9) {
        System.out.println("Obesidade grau I!");
        } else if (imc >= 35 && imc <= 40) {
        System.out.println("Obesidade grau II!");
        } else {
        System.out.println("Obesidade grau III!");
            }        
    
    
         }
    }
    
