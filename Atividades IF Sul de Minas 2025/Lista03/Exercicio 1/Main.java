
package Exercicio1;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Animal> animal = new ArrayList<>();
     
        char comando = 'S';

        do{
           Animal a = new Animal();
            System.out.print("Qual a raça do animal? ");
            a.setRaca(scan.nextLine());

            System.out.print("Qual o nome do animal? ");
            a.setNome(scan.nextLine());

            System.out.print("Qual a idade do animal? ");
            a.setIdade(scan.nextByte());
            scan.nextLine();

            System.out.print("Qual o peso do animal? ");  
           a.setPeso(scan.nextFloat());
           scan.nextLine();

            System.out.print("Qual a altura do animal? ");
            a.setAltura(scan.nextFloat());
            scan.nextLine();
            
            animal.add(a);
            
            System.out.print("Deseja inserir um novo animal (S/N)? ");
            comando = scan.next().charAt(0);
            scan.nextLine();
            
        } while (comando == 's' || comando == 'S');
        
        for(Animal dados : animal){
            dados.exibeDados();
        }
        scan.close();
    }
}
