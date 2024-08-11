import java.util.Scanner;
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int numeros[] = new int [10];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero para o vetor: ");
            int NumVetor = leitor.nextInt();
            numeros [i]= NumVetor;
        }
        
        System.out.println("Digite o numero que deseja buscar: ");
        int misterio = leitor.nextInt ();
        
        int indice;
        for(indice = 0; indice < numeros.length && misterio != numeros[indice]; indice++){
        }
        
        if(indice == numeros.length){
            System.out.println("Nao achei o numero desejado!");
        }else{
            System.out.println("Achei o numero e ele esta na posicao " + indice + " do vetor.");
        }
    }
}
/*
Escreva um programa em Java que leia 10 números inteiros, e armazene num vetor. Em
seguida, leia mais um número e verifique se ele é igual a um dos 10 números armazenados no
vetor.
*/
