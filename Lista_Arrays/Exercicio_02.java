import java.util.Scanner;
public class Exercicio_02 {
     public static void main (String []args){
        Scanner leitor = new Scanner (System.in);
        
        double [] primeiro = new double [10];
        double [] segundo = new double [10];
        double [] terceiro = new double [10];
        
        for(int i =0; i<10; i++){
            
            System.out.println("Digite um numero para o primeiro vetor:");
            double numero1 = leitor.nextDouble();
            primeiro[i] = numero1;
            
            System.out.println("Digite um numero para o segundo vetor:");
            double numero2 = leitor.nextDouble();
            segundo[i] = numero2;
            
            double multiplicacao = numero1*numero2;
            System.out.println("A multiplicacao dos valores digitados eh igual a: " + multiplicacao);
            System.out.println("");
        }
    }
}
/*
Elabore um programa em Java que leia dois vetores de dez elementos reais e faça a
multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor, que
deve ser mostrado como saída.
*/