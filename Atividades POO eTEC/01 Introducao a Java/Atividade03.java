/*3. Crie um programa que armazene um vetor com as notas de dez alunos,
calcule e imprima a média dessas notas e depois informe a quantidade
de notas acima e abaixo da média calculada.*/

import java.util.Scanner;


public class Atividade03 {

    static float mediaAlunos[] = new float[10];


    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < mediaAlunos.length; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", (i + 1));
            mediaAlunos[i] = scan.nextFloat();
        }

        System.out.println("A média total da turma é de: " +media(mediaAlunos));

        for (int i = 0; i < mediaAlunos.length; i++) {
            if (mediaAlunos[i] > media(mediaAlunos)) {
                System.out.printf("Aluno %d = Acima da média geral\n", (i + 1));
            } else if (mediaAlunos[i] < media(mediaAlunos)) {
                System.out.printf("Aluno %d = Abaixo da média geral\n", (i + 1));
            }
            else {
                System.out.printf("Aluno %d = Na média geral da turma\n", (i + 1));
            }
        }
        scan.close();
    }


    //Cálculo da média total
    static float media(float mediaAluno[]) {
        float media = 0;
        for (int i = 0; i < mediaAluno.length; i++) {
            media += mediaAluno[i];
        }
        float mediaTotal = media / mediaAluno.length;
        return mediaTotal;
    }
}