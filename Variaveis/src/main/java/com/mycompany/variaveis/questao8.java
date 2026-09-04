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

public class questao8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperatura;

        System.out.print("Digite a temperatura em Celsius: ");
        temperatura = entrada.nextDouble();

        System.out.println("A temperatura informada foi: " + temperatura + "C");
    }
}
