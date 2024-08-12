import java.util.Scanner;
public class Exercicio_02 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void Leitor_e_Media(){
        double vetor[] = new double [50];
        double soma =0;
        double contador = 0;
        
        for(int i =0; i<50; i++){
            System.out.println("Digite um valor real: ");
            double primeiro = leitor.nextDouble();
            vetor[i]=primeiro;
            contador++;
            soma += vetor[i];
        }
        double media = (soma / contador);
    }
}
/*
Escreva um novo programa, alterando o exercício 1, incluindo o cálculo da média aritmética dos 50 números.
*/
