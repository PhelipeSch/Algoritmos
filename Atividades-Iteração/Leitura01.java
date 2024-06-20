import java.util.Scanner;

public class Leitura01 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor1 = leitor.nextInt();
        System.out.println("Valor:" + valor1);
        //Esse código ele permite que você digite um valor inteiro armazene ele e exiba ele na tela tendo interatividade com o usuário 
    }
    
}