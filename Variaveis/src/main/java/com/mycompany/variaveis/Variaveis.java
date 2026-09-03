//Comentario de 1 linha

/*Comentario
de varias
linhas*/

package com.mycompany.variaveis;

/* @author RogerioSilva */

import java.util.Scanner;

public class Variaveis {

    //A classe main e quem executa os codigos
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // ===== 1. CADASTRO DE NOME =====

        // Variável do tipo String para armazenar o nome
        String nome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Ola, " + nome + "! Seja bem-vindo(a) ao Java.");

        
        // ===== 2. IDADE DO USUÁRIO =====

        int idade;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Voce tem " + idade + " anos.");
        
        entrada.close();
     }
}