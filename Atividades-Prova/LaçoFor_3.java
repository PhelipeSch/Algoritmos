import java.util.Scanner;
public class LaçoFor_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um numero inteiro maior que 1: ");
        int valor = leitor.nextInt();
        
        for(int i =0; i <= valor; i++){
            double par = i%2;
            if(par == 0 ){
                System.out.println("Par: " + i);
            }
        }
        
        for(int i=0; i <= valor; i++){
            double impar = i%2;
            if(impar != 0 ){
                System.out.println("Impar: " + i);
            }
            
        }
    }
}
/*
Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
*/