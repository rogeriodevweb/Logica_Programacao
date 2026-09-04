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

public class questao5 {
    public static void main(String[] args) {

        Scanner entradaNumero = new Scanner(System.in);

        int idade;
        boolean maiorDeIdade;

        System.out.print("Digite sua idade: ");
        idade = entradaNumero.nextInt();

        maiorDeIdade = idade >= 18;

        System.out.println("Maior de idade: " + maiorDeIdade);
    }
}
