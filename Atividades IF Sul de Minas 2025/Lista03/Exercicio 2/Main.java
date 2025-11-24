
package Exercicio2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes op = new Operacoes();
        System.out.println("==============================");
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4-Divisão");
        byte n = scanner.nextByte();
        
        if (n > 0 && n < 5){
        System.out.println("=====Digite abaixo os números desejados para o operação=====");
        System.out.print("Digite o primeiro número: ");
        float n1 = scanner.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = scanner.nextFloat();
        
        switch (n) {
            case 1:
                System.out.println("Resultado: " + op.soma(n1, n2));
                break;
            case 2:
                System.out.println("Resultado: " + op.subtracao(n1 ,n2));
                break;
            case 3:
                System.out.println("Resultado: " + op.multiplicacao(n1, n2));
                break;
            case 4:
                System.out.println("Resultado: " + op.divisao(n1, n2));
                break;
            default:
                throw new AssertionError();
        }
        }
        else System.out.println("Número de operação inválido.\nTente novamente!");
    }
}
