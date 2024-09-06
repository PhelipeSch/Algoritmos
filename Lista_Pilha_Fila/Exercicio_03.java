import java.util.Stack;
import java.util.Scanner;
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Stack <Integer> pilha = new Stack();
        Stack <Integer> NegPares = new Stack();
        Stack <Integer> PosImpares = new Stack();
        
        
        for(int i =0; i < 25; i++){
            System.out.print("Digite um valor inteiro: ");
            int elemento = leitor.nextInt();
            pilha.push(elemento);
        }
        for(int i =0; i < 25; i++){
            int saida = pilha.pop();
            if(saida % 2 == 0){
                if(saida < 0){
                    NegPares.push(saida);
                }
            }else{
                if(saida > 0){
                PosImpares.push(saida);
                }
            }
        }
    }
}
/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir do teclado, de 25 valores e armazene na pilha.
Retire cada um dos elementos da pilha e armazene-os em duas novas pilhas, uma somente para valores pares negativos e a outra para valores ímpares positivos. Descarte todos os demais.
*/