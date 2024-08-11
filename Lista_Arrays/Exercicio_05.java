import java.util.Scanner;
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int vetor[] = new int [10];
        for(int i =0; i < 10; i++){
            System.out.println("Digite um numero para o vetor: ");
            int numero = leitor.nextInt();
            vetor[i] = numero;
        }
        
        int i;
        for(i =0; i < vetor.length; i++){ 
           int proxNum = i+1;
           if(i < 9 && vetor[i] == vetor[proxNum]){
               System.out.println("Existem duplicatas");
           }else{
               System.out.println("Nao existem duplicatas");
           }
        }
    }
}
/*
Escreva um programa em Java que leia 10 números inteiros. Como saída, deve informar se
existe algum igual. Não precisa informar quais são os números, apenas se há duplicatas.
*/
/*
 for(int i = 0; i < Valores.length; i++) {
            if(i < 9 && Valores[i] == Valores[i+1]) {
                System.out.println("Duplicata achada");
            }
        }    
*/