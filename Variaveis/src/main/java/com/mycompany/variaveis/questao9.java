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

public class questao9 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    boolean matriculado;

    System.out.print("O aluno esta matriculado? (true/false): ");
    matriculado = entrada.nextBoolean();

    System.out.println("Aluno matriculado: " + matriculado);
    }
}