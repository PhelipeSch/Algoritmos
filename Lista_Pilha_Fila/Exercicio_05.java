import java.util.Stack;
import java.util.Scanner;
public class Exercicio_05 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Stack<Integer> pilha = new Stack();
        
        System.out.print("Digite um numero para descobrirmso seu valor na base binaria: ");
        int numero = leitor.nextInt();
        
        while( numero  > 0) {
            int resto = numero % 2;
            numero = numero / 2;
            pilha.push(resto);
        }
        StringBuilder numeroBinario = new StringBuilder();
        while (!pilha.isEmpty()) {
            numeroBinario.append(pilha.pop());
        }

        System.out.println("Segundo o numero digitado, este eh sua equivalencia na base binaria: " + numeroBinario.toString());
    }
}
/*
Escreva um programa para converter um número inteiro decimal para binário.
Leia um número inteiro decimal do usuário. 
Enquanto o quociente da divisão for maior que zero, calcule o resto da divisão por 2 e empilhe esse resto.
Use o novo quociente como divisor e prossiga.
Ao final,desempilhe os elementos e concatene-os para formar o número binário.
Na figura abaixo édemonstrado um exemplo da primeira etapa, que é o cálculo e empilhamento.
*/