import java.util.Stack;
import java.util.Scanner;
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        Stack <Character> pilha = new Stack();
        
        System.out.print("Digite uma String: ");
        String elemento = leitor.nextLine();
        String Final = "";
        
        for(int i =0; i < elemento.length(); i++){
            pilha.push(elemento.charAt(i));
        }
        
        while(!pilha.isEmpty()) {
            Final += pilha.getLast();
            pilha.pop();
        }
        
        System.out.println(Final);
    }
}
/*
Escreva um programa que leia uma string.
Em seguida, empilhe cada um dos caracteres da string, desde o início.
Desempilhe os caracteres e junte-os (concatene-os numa nova string).
Imprima a nova string.
*/