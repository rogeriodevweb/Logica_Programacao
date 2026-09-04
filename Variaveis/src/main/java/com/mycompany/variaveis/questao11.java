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
public class questao11 {
    public static void main(String[] args) {
        

        double numero1, numero2, numero3;
        double soma, multiplicacao, divisao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero decimal: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero decimal: ");
        numero2 = entrada.nextDouble();

        System.out.print("Digite o terceiro numero decimal: ");
        numero3 = entrada.nextDouble();

        soma = numero1 + numero2 + numero3;
        multiplicacao = numero1 * numero2 * numero3;
        divisao = numero1 / numero3;

        System.out.println("A soma dos numeros e: " + soma);
        System.out.println("A multiplicacao dos numeros e: " + multiplicacao);
        System.out.println("A divisao do primeiro pelo ultimo e: " + divisao);

        entrada.close();
    }
}
