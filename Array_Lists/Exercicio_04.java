import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList<Integer> valores = new ArrayList();
        ArrayList<Integer> Impares = new ArrayList();
        int valor;
        
        for(int i =0; i < 15; i++){
            System.out.print("Digite um valor para inserirmos na lista: ");
            valor = leitor.nextInt();
            valores.add(valor);
        }        
        for(int i =0; i < valores.size(); i++){
            int ingual = valores.get(i);
            if( ingual %2 != 0){
                Impares.add(ingual);
                valores.remove(i);
            }
        }
        System.out.println("Os valores inseridos na segunda lista são: "+Impares);
    }
}
/*
Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Faça a leitura,
a partir do teclado, de 15 valores e armazene na lista. Crie uma segunda lista para numeros
inteiros. Percorra a primeira lista e remova todos os valores armazenados que são ímpares,
inserindo-os na segunda lista. Exiba todos os valores inseridos na segunda lista.
*/