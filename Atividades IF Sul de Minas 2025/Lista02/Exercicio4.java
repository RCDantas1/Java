package Lista02;

/* 4) Defina uma classe Exercicio4.java e dentro da classe escreva o método main.
 Usando a estrutura de repetição for, calcule e exiba a soma dos números ímpares
 de 1 a 9. */

public class Exercicio4 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números ímpares de 1 a 9 é: " + soma);
    }
}
    
