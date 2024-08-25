import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList<Integer> valores = new ArrayList();
        ArrayList<Double> restos = new ArrayList();
        for(int i =0; i < 30; i++){
            System.out.print("Digite um valor para inserirmos na lista: ");
            int valor = leitor.nextInt();
            valores.add(valor);
            double resto = valor % 2.0;
            restos.add(resto);
            double val = restos.get(i);
            if(val != 0){
                System.out.println("O valor digitado no indice "+ i +" eh impar!");
            }
            System.out.println("");
        }
    }
}
/*
Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Faça a leitura,
a partir do teclado, de 30 valores e armazene na lista. Percorra a lista e informe o índice de todos
os valores armazenados que são ímpares.
*/