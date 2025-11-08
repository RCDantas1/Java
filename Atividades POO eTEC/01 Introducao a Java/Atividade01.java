/*1. Faça um programa que dada a idade de uma pessoa verifique sua classe
eleitoral:
• menor que 16 anos não pode votar;
• com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
• entre 18 e 65 anos (inclusive), votar é obrigatório. */

import java.util.Scanner;

public class Atividade01{
    public static void main (String[] args){
        System.out.println("Digite sua idade: ");
        Scanner scan = new Scanner (System.in);
        int idade = scan.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar.");
        }
        else if ((idade >= 18) && (idade <= 65)){
            System.out.println("Votar é obrigatório!");
        }
        else{
            System.out.println("Votar é opcional.");
        }
        scan.close();
    }
}
