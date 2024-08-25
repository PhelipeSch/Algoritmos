import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList<Integer> leitura = new ArrayList();
        
        for(int i =0; i < 20; i++){
            System.out.print("Digite o valor para inserirmos na lista: ");
            int valor = leitor.nextInt();
            leitura.add(valor);
        }
        
    }
}
/*Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Em seguida,
faça a leitura, a partir do teclado, de 20 valores e armazene na lista.
*/