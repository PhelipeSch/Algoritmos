import java.util.Scanner;
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int A [] = new int [6];
        for ( int i = 0; i < 6; i++){
            System.out.println("Digite um valor para o vetor");
            int numero = leitor.nextInt();
            A [i] = numero;
        }
        
        int soma = A[0]+A[1]+A[5];
        System.out.println("O valor da soma foi de: "+soma);
        A[4] =100;
          
       for(int i =0; i < A.length; i++){
            System.out.println("O valor digitado na posicao "+ i + " foi: " + A[i]);
        }
    }
}
/*
Faça um programa em Java que possua um vetor denominado A que armazene 6 números
inteiros, lidos pelo teclado. O algoritmo deve executar os seguintes passos:
a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
b) Armazene em uma variável inteira (simples) a soma dos valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
d) Mostre na tela cada valor do vetor A, um em cada linha.
*/