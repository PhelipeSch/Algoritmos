import java.util.LinkedList;
import java.util.Scanner;
public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        LinkedList<Integer>fila = new LinkedList();
        
        for(int i =0; i < 20; i++){
            System.out.print("Digite um valor inteiro: ");
            int armaz = leitor.nextInt();
            fila.offer(armaz);
        }
        for(int i =0; i < 20; i++){
            int retirada = fila.poll();
            System.out.println(retirada);
        }
    }
}
/*
Escreva um programa que crie uma fila para armazenar valores inteiros. Em seguida, faça a
leitura, a partir do teclado, de 20 valores e armazene na fila. Ao final, retire todos os elementos
da fila e imprima na tela cada um.
*/