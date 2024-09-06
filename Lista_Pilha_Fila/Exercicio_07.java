import java.util.LinkedList;
import java.util.Scanner;
public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        LinkedList<Integer>fila = new LinkedList();
        LinkedList<Integer> positivos = new LinkedList();
        LinkedList<Integer> negativos = new LinkedList();
        
        for(int i =0; i < 20; i++){
            System.out.print("Digite um valor inteiro: ");
            int armaz = leitor.nextInt();
            fila.offer(armaz);
        }
        for(int i =0; i < 20; i++){
            int retirada = fila.poll();
            if(retirada > 0){
                positivos.offer(retirada);
            }else{
                negativos.offer(retirada);
            }
        }
    }
}
/*
Escreva um programa que crie uma fila para armazenar valores inteiros.
Faça a leitura, a partir do teclado, de 30 valores e armazene na fila.
Retire cada um dos elementos da fila e armazene-os em duas novas filas, uma somente para valores positivos e a outra para valores não-positivos..
*/