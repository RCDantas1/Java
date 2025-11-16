package Lista02;

/* 3) DefinaumaclasseExercicio3.javaedentrodaclasseescrevaométodomain. Usando
 a estrutura de repetição do...while exibir os números que terminam com o algarismo 5
 começando em 100 indo até-100. */

 
public class Exercicio3 {
    public static void main(String[] args) {
        int i = 100;
        do { 
            if(i % 5 == 0 && i % 2 !=0){
                System.out.println(i);
            }
            i--;
        } while (i >= -100);
    }
    
}
