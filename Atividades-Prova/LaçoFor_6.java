import java.util.Scanner;
public class LaçoFor_6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double maior =0;
        double maior2 = 0;
        
        for(int i = 0; i<=9; i++){
            System.out.print("Digite um valor: ");
            double valor = leitor.nextInt();
            
            if(valor > maior){
                maior = valor;
            }else{
                if(valor > maior2){
                maior2 = valor;
                }
            }
        }
        System.out.println("O maior valor foi: " + maior );
        System.out.println("O segundo maior valor foi: " + maior2 );

    }
    
}
/*
Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre os dois maiores números digitados pelo usuário.
*/