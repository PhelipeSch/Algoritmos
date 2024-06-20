import java.util.Scanner;
// "importação" do scanner para ler o teclado e fazer o código funcionar

public class Leitura02 {
    // denomina o código e cria sua pasta 
    public static void main(String[] args){
    // Define qual a função do código
        Scanner leitor = new Scanner(System.in);
        // "ativa" o scaner para monitorar o teclado e ver qual numero foi digitado 
        System.out.print("Digite um valor inteiro: ");
        // Exibe na tela o lugar para digitar o número inteiro
        int valor1 = leitor.nextInt();
        // Explica que a variavel um tera o valor do numero que foi digitado 
        valor1++;
        // Incrementa o número que foi escrito 
        System.out.println("Valor Incrementado uma vez:" + valor1);
        // Mostra na tela o numero incrementado uma vez 
       valor1++;
       // Incrementa mais uma vez o numero digitado ficando duas vezes incrementado 
        System.out.println("Valor Incrementado duas vezes:" + valor1);
        // Exibe na tela o numero duas vezes já incrementado
    }
    
}