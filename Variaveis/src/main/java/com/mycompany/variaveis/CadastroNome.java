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
public class CadastroNome {
    public static void main(String[] args) {
        
        String nome;
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome=entradaTexto.nextLine();
        
        System.out.println("Ola, "+nome+"! Seja bem vindo(a) ao Java");
        
    }
}
