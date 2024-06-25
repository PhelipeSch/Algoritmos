import java.util.Scanner;
public class LaçoFor_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double maior = 0;
        
        for(int i =0; i<=9; i++){
            
            System.out.print("Digite um valor: ");
            double valor = leitor.nextDouble();
            
            if(valor > maior){
                maior = valor;
            }
        }
        
        System.out.println("O maior valor foi: " + maior);
        
    }
    
}
/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre qual destes números é o maior.
*/