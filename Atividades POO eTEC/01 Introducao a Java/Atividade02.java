/*2. Faça um programa que imprima os trinta primeiros elementos da série
de Fibonacci. A série é a seguinte: 1, 1, 2, 3, 5, 8,13 etc. Para calculá-la,
o primeiro e segundo elementos valem 1; daí por diante, cada elemento
vale a soma dos dois elementos anteriores. */



public class Atividade02 {
    public static void main(String[] args) {
        int fibo[] = new int[30];

        for(int i = 0; i < fibo.length; i++){
            if((i == 0) || (i == 1)){
                fibo[i] = 1;
            }
            else{
                fibo[i] = (fibo[i - 1] + fibo[i - 2]);
            }
        }

        System.out.print("\nSequência de Fibo: ");
        for (int i = 0; i < fibo.length; i++){
            System.out.print(+fibo[i]+ " ");
        }
        System.out.println("");

    }
    
}
