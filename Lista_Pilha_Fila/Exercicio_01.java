import java.util.Stack;
import java.util.Scanner;
public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Stack <Integer> pilha = new Stack();
        
        for(int i =0; i < 20; i++){
            System.out.print("Digite um valor inteiro: ");
            int elemento = leitor.nextInt();
            pilha.push(elemento);
        }
        for(int i =0; i < 20; i++){
            int saida = pilha.pop();
            System.out.println(saida);
        }
    }
}
/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. 
Em seguida, faça a leitura, a partir do teclado, de 20 valores e armazene na pilha. 
Ao final, retire todos os elementos da pilha e imprima na tela cada um.
*/