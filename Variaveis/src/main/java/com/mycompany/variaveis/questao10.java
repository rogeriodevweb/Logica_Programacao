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

public class questao10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        boolean carteiraAssinada;
        String cargo;
        String setor;
        String telefone;
        String email;
        String cidade;
        
        

        System.out.print("Digite o nome do funcionario: ");
        nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite o salario: ");
        salario = entrada.nextDouble();

        System.out.print("Possui carteira assinada? (true ou false): ");
        carteiraAssinada = entrada.nextBoolean();

        entrada.nextLine(); // limpa o Enter

        System.out.print("Digite o cargo: ");
        cargo = entrada.nextLine();

        System.out.print("Digite o setor: ");
        setor = entrada.nextLine();

        System.out.print("Digite o telefone: ");
        telefone = entrada.nextLine();

        System.out.print("Digite o e-mail: ");
        email = entrada.nextLine();

        System.out.print("Digite a cidade: ");
        cidade = entrada.nextLine();


        
        System.out.println("\n--- RESUMO DO FUNCIONARIO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salario: R$ " + salario);
        System.out.println("Carteira assinada: " + carteiraAssinada);
        System.out.println("Cargo: "+cargo);
        System.out.println("Setor: "+setor);
        System.out.println("telefone: "+telefone);
        System.out.println("Email: "+email);
        System.out.println("cidade: "+cidade);  
    }
}


