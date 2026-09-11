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
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        //variaveis
        int numeroProduto, quantidade;
        double valorTotal;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Ola, seja bem-vindo(a)");
        System.out.println("Por favor, digite o numero do seu pedido:");        
        System.out.println("1-Hamburguer = 15,00\n"
                + "2-Pizza = 25,00\n"
                + "3-Cachorro-quente = 12,00\n"
                + "4-Refrigerante = 6,00\n"
                + "2"
                + "5-Suco = 8,00");
        numeroProduto = entradaNumero.nextInt();
        System.out.println("Digite a quantidade desejada:");
        quantidade = entradaNumero.nextInt();
        
        switch(numeroProduto){
            case 1:
                valorTotal=15*quantidade;
                System.out.println("Voce escolheu "+quantidade+ " de hamburguer e o valor total e "+valorTotal+ " reais");
                break;
            case 2:
                valorTotal=25*quantidade;
                System.out.println("Voce escolheu "+quantidade+ " de Pizza e o valor total e "+valorTotal+ " reais");
                break;
            case 3:
                valorTotal=12*quantidade;
                System.out.println("Voce escolheu "+quantidade+ " de Cachorro-quente e o valor total e "+valorTotal+ " reais");
                break;
            case 4:
                valorTotal=6*quantidade;
                System.out.println("Voce escolheu "+quantidade+ " de Refrigerante e o valor total e "+valorTotal+ " reais");
                break;
            case 5:
                valorTotal=8*quantidade;
                System.out.println("Voce escolheu "+quantidade+ " de Suco e o valor total e "+valorTotal+ " reais");
                break;
            default:
                System.out.println("A opcao escolhida e invalida");
                break;           
        }   
    }
}
