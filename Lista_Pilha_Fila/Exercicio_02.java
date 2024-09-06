import java.util.Stack;
import java.util.Scanner;
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Stack <Integer> pilha = new Stack();
        Stack <Integer> pares = new Stack();
        Stack <Integer> impares = new Stack();
        
        
        for(int i =0; i < 30; i++){
            System.out.print("Digite um valor inteiro: ");
            int elemento = leitor.nextInt();
            pilha.push(elemento);
        }
        for(int i =0; i < 30; i++){
            int saida = pilha.pop();
            if(saida % 2 == 0){
                pares.push(saida);
            }else{
                impares.push(saida);
            }
        }
    }
}
/*
Escreva um programa que crie uma pilha para armazenar valores inteiros.
Faça a leitura, a partirdo teclado, de 30 valores e armazene na pilha.
Retire cada um dos elementos da pilha e armazene-os em duas novas pilhas, uma somente para valores pares e a outra para valores ímpares.
*/