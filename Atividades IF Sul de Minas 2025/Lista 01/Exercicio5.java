package Lista01;


import java.util.Scanner;

enum mes{JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, 
                    JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO};

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero do mes (1-12): ");
        int numMes = scan.nextInt();
       
        if(numMes >= 1 && numMes <= 12){
            System.out.println("O mes escolhido foi: " + mes.values()[numMes - 1]);
        } else {
            System.out.println("Numero invalido! Por favor, digite um numero entre 1 e 12.");
        }
    }
}
