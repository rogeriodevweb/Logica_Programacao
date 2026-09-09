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
public class Exemplo2 {
    public static void main(String[] args) {
        
        //Variaveis
        int quantidadeMiojo, quantidadeSalada;
        
        //Scanner
        Scanner entradaNumero= new Scanner(System.in);
        
        //Solicitar dados para o usuario
        System.out.println("A quantos dias voce nao come miojo?");
        quantidadeMiojo = entradaNumero.nextInt();
        System.out.println("A quantos dias voce nao come salada?");
        quantidadeSalada = entradaNumero.nextInt();
        
        /* Se quantidade de miojo for menor que 2
                        ou
        quantidade de salada for maior que 7
                  "pouco saudavel"    */    
        if(quantidadeMiojo<2 || quantidadeSalada>7){
            System.out.println("Pouco saudavel!");        
        }
        if(quantidadeMiojo>=2 || quantidadeSalada<7){
            System.out.println("Saudavel!");            
        }
    }
}
