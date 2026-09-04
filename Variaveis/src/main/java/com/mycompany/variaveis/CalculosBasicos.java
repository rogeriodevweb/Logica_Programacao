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
public class CalculosBasicos {
    
    public static void main(String[] args) {

        // Trabalhar com cálculo de soma
        int numero1, numero2, resultadoResto;
        int opcao;
        
        // solicite 3 numeros decimais ao usuario, e devolva a ele a soma, a multiplicacao e a divisaodo primeiro com o ultimo
        
        double resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao;

        Scanner entradaNumero = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        numero1 = entradaNumero.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        numero2 = entradaNumero.nextInt();

        System.out.println("Escolha uma operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        System.out.print("Digite a opcao: ");
        opcao = entradaNumero.nextInt();

        switch (opcao) {

            case 1:
                resultadoSoma = numero1 + numero2;
                System.out.println("A soma dos numeros e: " + resultadoSoma);
                break;

            case 2:
                resultadoSubtracao = numero1 - numero2;
                System.out.println("A subtracao dos numeros e: " + resultadoSubtracao);
                break;

            case 3:
                resultadoMultiplicacao = numero1 * numero2;
                System.out.println("O resultado da multiplicacao e: " + resultadoMultiplicacao);
                break;

            case 4:
                resultadoDivisao = (double) numero1 / numero2;
                System.out.println("O resultado da divisao e: " + resultadoDivisao);
                     
                //calculo de resto
                resultadoResto = numero1 % numero2;
                System.out.println("O resultado da porcenagem e:"+resultadoResto);
                break;
                
            default:
                System.out.println("Opcao invalida!");
        }

        entradaNumero.close();
    }
}