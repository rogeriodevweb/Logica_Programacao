/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {

        Scanner entradaNumero = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.print("Digite a primeira nota: ");
        nota1 = entradaNumero.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entradaNumero.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A media e: " + media);
    }
}