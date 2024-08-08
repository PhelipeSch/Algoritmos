import java.util.Scanner;
public class Exercicio_01 {
    public static void main (String []args){
        Scanner leitor = new Scanner (System.in);
        
        double [] guardador = new double [100];
        
        for(int i = 0; i<100; i++){
            System.out.println("Digite um numero para descobrimos o quadrado e o cubo deles:");
            double numero = leitor.nextDouble();
            guardador[i] = numero;
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            System.out.println("O quadrado de " + numero + " eh: "+ quadrado);
            System.out.println("O cubo de " + numero + " eh: "+ cubo);
        }
    }
}
/*
Escreva um programa em Java que leia 100 números reais e armazene num vetor. Em seguida,
exiba o quadrado e o cubo de cada um dos números.
*/