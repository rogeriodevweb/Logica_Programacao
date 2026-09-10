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
public class Exemplo3 {
    public static void main(String[] args) {
        
        //variaveis
        int idadeP1, idadeP2, idadeP3;
        
        //Scanner
        Scanner entradaNumero = new Scanner(System.in);
        
        //Solicitar dados ao usuario
        
        System.out.println("Digite a idade da pessoa 1:");
        idadeP1 = entradaNumero.nextInt();
        System.out.println("Digite a idade da pessoa 2:");
        idadeP2 = entradaNumero.nextInt();
        System.out.println("Digite a idade da pessoa 3:");
        idadeP3 = entradaNumero.nextInt();
        
        //avaliacao das idades
        if (idadeP1>idadeP2 || idadeP1<idadeP3){
            System.out.println("Pessoa 1 ganha um brinde");
        }
        if (idadeP2>idadeP3 && idadeP2>idadeP1){
            System.out.println("Pessoa 2 ganha um brinde");
        }
        if ((idadeP3<idadeP1 || idadeP3<idadeP2)  && idadeP2>idadeP1){
            System.out.println("Pessoa 3 ganha um brinde");
        }
        
        
        
        
    }
}
