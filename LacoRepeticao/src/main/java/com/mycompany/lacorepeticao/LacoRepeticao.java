/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author RogerioSilva
 */
public class LacoRepeticao {

    public static void main(String[] args) {
       
        String [] listaConvidados = new String[5];        
        Scanner entradaTexto = new Scanner(System.in);
        //SOLICITAR QUE DONA DA FESTA PREENCHA A LISTA
        
        for(int cont = 0;cont<=4;cont++){
            System.out.println("Digite o nome do convidado:");   
            listaConvidados[cont] = entradaTexto.nextLine();
        }           
        //imprimir a lista de convidados
        for(int cont=0;cont<=4;cont++){
            System.out.println("Convidado "+cont+" :" +listaConvidados[cont]);
        }
    }
}
