import java.util.Scanner;
public class Exercicio_06 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void LeitorDeDados_Vetor(){
        int vetor[] = new int [7];
        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite um valor inteiro entre 1 e 99: ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou o valor errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou o valor errado");
                    i--;
                }else{
                    vetor[i]=valor;
                }
            }
            
        }
    }
}
/*
Escreva um algoritmo que leia e armazene num vetor 7 números inteiros que devem estar entre
1 e 99, incluindo os extremos. O programa não pode aceitar valores fora do intervalo.
*/