package Lista01;

/* 3) Defina uma classe Exercicio3.javae dentro da classe escreva o método main. Defina
 duas variáveis do tipo float e atribua um valor para cada uma delas. Mande o programa exibir
 qual delas é maior.*/

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float n1, n2;
		System.out.println("Digite o primeiro valor: ");
		n1 = scan.nextFloat();
		System.err.println("Digite o segundo valor: ");
		n2 = scan.nextFloat();

		if(n1 >= n2)
		System.out.printf("O maior valor digitado foi %.2f", n1);
		else
		System.out.printf("O maior valor digitado foi %.2f", n2);
		
	}

}
