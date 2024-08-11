import java.util.Scanner;
public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int contador[] = new int [100];
        
        double vetor []= new double [100];
        for(int i =0; i < 100; i++){
            System.out.println("Digite um numero entre 1 e 10 que seja real: ");
            double valor = leitor.nextDouble();
            vetor[i] = valor;
            
            if(valor > 0 && valor <= 1){
                contador[0]++;
            }
            if(valor > 1 && valor <= 2){
                contador[1]++;
            }
            if(valor > 2 && valor <= 3){
                contador[2]++;
            }
            if(valor > 3 && valor <= 4){
                contador[3]++;
            }
            if(valor > 4 && valor <= 5){
                contador[4]++;
            }
            if(valor > 5 && valor <= 6){
                contador[5]++;
            }
            if(valor > 6 && valor <= 7){
                contador[6]++;
            }
            if(valor > 7 && valor <= 8){
                contador[7]++;
            }
            if(valor > 8 && valor <= 9){
                contador[8]++;
            }
            if(valor > 9 && valor <= 10){
                contador[9]++;
            }
        }
        System.out.println("Existem "+contador[0]+" valores ate 1");
        System.out.println("Existem "+contador[1]+" valores entre 1 e 2");
        System.out.println("Existem "+contador[2]+" valores entre 2 e 3");
        System.out.println("Existem "+contador[3]+" valores entre 3 e 4");
        System.out.println("Existem "+contador[4]+" valores entre 4 e 5");
        System.out.println("Existem "+contador[5]+" valores entre 5 e 6");
        System.out.println("Existem "+contador[6]+" valores entre 6 e 7");
        System.out.println("Existem "+contador[7]+" valores entre 7 e 8");
        System.out.println("Existem "+contador[8]+" valores entre 8 e 9");
        System.out.println("Existem "+contador[9]+" valores entre 9 e 10");
        
    }
}
/*
Escreva um programa em Java que leia 100 números naturais, cujos valores estão no intervalo
[1, 10], e conte quantos números de cada valor (1 a 10) existe.
*/