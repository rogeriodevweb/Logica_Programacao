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
public class ControleEntrada {
    public static void main(String[] args) {
        
        String nome, tipoIngresso;
        int idade;
        boolean possuiAutorizacao = false; 
                
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaLogica = new Scanner(System.in);
        
        
        System.out.println("Ola, me diga seu nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("digite sua idade:");
        idade = entradaNumero.nextInt();
        
        System.out.println("digite tipo e ingresso:");
        tipoIngresso = entradaTexto.nextLine();
                
        System.out.println("Possui autorizacao? (true/false):");
        possuiAutorizacao = entradaLogica.nextBoolean();
        
        System.out.println("Nome: " + nome + ", idade: " + idade + ", autorizacao: " + possuiAutorizacao + " e tipo de ingresso: " + tipoIngresso + ".");

        if(idade>=18 && tipoIngresso.equals("vip")){
            System.out.println("Acesso vip liberado!");
        }
        else if(idade>=18 && tipoIngresso.equals("comum")){
            System.out.println("Acesso comum liberado!");
        }
        else if ((idade==16 || idade==17) && possuiAutorizacao==true){
             System.out.println("Acesso liberado com autorizacao!");
        }
        else if (tipoIngresso.equals("Professor") || tipoIngresso.equals("Funcionario")) {
            System.out.println("Acesso especial liberado!");
        }
        else {
            System.out.println("Acesso negado!");            
        }
        
    }
}
