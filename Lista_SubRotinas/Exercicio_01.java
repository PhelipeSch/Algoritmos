import java.util.Scanner;
public class Exercicio_01 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void LeitorDeDados(){
        double vetor[] = new double [50];
        for(int i =0; i<50; i++){
            System.out.println("Digite um valor real: ");
            double primeiro = leitor.nextDouble();
            vetor[i]=primeiro;
        }
    }
}
/*
Escreva um programa em Java que leia e armazene 50 números reais.
*/