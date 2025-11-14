package Lista01;

/* 4) Defina uma classe Exercicio4.javae dentroda classe escreva o método main. Defina
 uma variável inteira denominada ddd. Usando o switch/case e com base no valor que você
 atribuir a ela, mande o programa exibir o destino com base na tabela a seguir:
 O programa deverá exibir “DDD não cadastrado.” se o valor atribuído à variável não estiver
 presente na tabela */

import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int ddd;
    System.out.println("Digite o DDD para saber a localidade: ");
    ddd = scan.nextInt();

    switch (ddd) {
        case 61:
            System.out.println("Brasília");
            break;
        case 71:
            System.out.println("Salvador");
            break;
        case 11:
            System.out.println("São Paulo");
            break;
        case 21:
            System.out.println("Rio de Janeiro");
            break;
        case 32:
            System.out.println("Juiz de Fora");
            break;
        case 19:
            System.out.println("Campinas"); 
            break;
        case 27:    
            System.out.println("Vitória");
            break;  
        case 31:
            System.out.println("Belo Horizonte");
            break;
        default:
            System.out.println("DDD não cadastrado.");
    }
    scan.close();
 }
}
