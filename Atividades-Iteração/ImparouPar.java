import java.util.Scanner;
public class ImparouPar {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        System.out.print("Digite um numero:");
        int numero = leitor.nextInt();
        int resto = numero %2;
        if( resto == 0 ) { // número é NÂO negativo
            System.out.println("Numero e par");
        } else {
            System.out.println("numero e impar");
           }
        }
    }
