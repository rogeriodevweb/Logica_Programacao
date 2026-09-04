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

public class questao6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;

        System.out.println("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;

        System.out.println("Resultado da soma: " + soma);
    }
}
