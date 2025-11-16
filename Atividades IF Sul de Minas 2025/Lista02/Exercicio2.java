package Lista02;

/* 2) DefinaumaclasseExercicio2.javaedentrodaclasseescrevaométodomain. Usando
 a estrutura de repetição while exibir os múltiplos de 100 até o valor 1000 */

public class Exercicio2 {
    public static void main(String[] args) {
        int i = 100;
        while (i <= 1000) {
           if(i % 100 == 0){
            System.out.println(i);
           }
            i++;
        }
        }
    }

