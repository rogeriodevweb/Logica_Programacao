/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author RogerioSilva
 */
public class Condicional {

    public static void main(String[] args) {
        /*Condicional e o codigo para avaliar dados, e 
        se for verdadeiro executa uma acao, e 
        se for falso realiza outra acao.
        SE- IF
        SENAO - ELSE
        
        TABELA LOGICA:
        > MAIOR QUE
        < MENOR QUE
        >= MAIOR OU IGUAL
        <= MENOR OU IGUAL
        == IGUAL
        =! DIFERENTE        
        */
        
        //Variavel
        int idade;
        
        //variavel de entrada de dados
        Scanner entradaNumero = new Scanner(System.in);
        
        //Solicitacao para o usuario
        System.out.println("Digite a sua idade:");
        idade = entradaNumero.nextInt();
        
        //analise de dados
        if (idade>=18){
            System.out.println("Voce e maior de idade");    
        }else{
            System.out.println("Voce e menor de idade");            
        }//fim do else
        
        
        
    }
}
