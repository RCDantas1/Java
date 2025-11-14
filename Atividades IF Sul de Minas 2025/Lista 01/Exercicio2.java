package Lista01;

/*2) Definaumaclasse Exercicio2.java e dentro da classe escreva o método main. Defina
uma variável inteira e atribua um valor para ela. Mande o programa exibir “Eh par!” se o valor
atribuído for par e “Eh impar!”, caso contrário. Use o operador % para verificar se o valor é par*/

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int valor = scan.nextInt();
		
		if (valor % 2 == 0)
			System.out.println("Eh par!");
		else
			System.out.println("Eh impar!");
		scan.close();
	}
	

}
