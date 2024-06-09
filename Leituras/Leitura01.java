import java.util.Scanner;

public class Leitura01 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor:" + valor1++);
    }
    
}