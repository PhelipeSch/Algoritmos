import java.util.Scanner;
// Importação do scanner para ler o que é digitado e fazer o código funcionar

public class Leitura03 {
    // denomina o código e cria sua pasta 
    public static void main(String[] args){
    // Define qual será a função do código
        Scanner leitor = new Scanner(System.in);
        // "ativa" o scaner para monitorar o teclado e ver qual numero foi digitado e fazer as contas
        System.out.print("Digite o primeiro valor inteiro: ");
        // Exibe na tela o lugar para digitar o primeiro numero inteiro e guarda ele
        int valor1 = leitor.nextInt();
        // Explica que a variavel um tera o valor do numero que foi digitado 
      System.out.print("Digite o segundo valor inteiro: ");
        // Exibe na tela o lugar para digitar o segundo numero inteiro e guarda ele
        int valor2 = leitor.nextInt();
        // Explica que a variavel dois tera o valor do numero que foi digitado 
       int soma = valor1+valor2;
       // cria a variável soma e declara ela 
       System.out.println("Resultado da soma:"+ soma);
      // Exibe na tela a variável soma 
       int subtração = valor2-valor1;
       //Cria a variavel subtracao e declara ela 
       System.out.println("Resultado da subtracao do segundo pelo primeiro:"+ subtração);
       // exibe na tela a variavel da subtracao e explica que esse numero corresponde a esse resultado
       int multiplicacao = valor1*valor2;
       // cria a variavel multiplicacao e declara o valor dela
       System.out.println("Resultado da multiplicacao:"+ multiplicacao);
       // exibe na tela uma explicacao sobre o que é esse resultado e tambem a variavel multiplicacao
       int divisao = valor1/valor2;
       // cria a variavel divisao e declara ela 
       System.out.println("Resultado da divisao do primeiro pelo segundo:"+ divisao);
       //imprime na tela uma explicacao sobre a divisao e a variavel 
       int restodiv = valor1%valor2;
       // cria a variável do resto da divisao e declara ela 
       System.out.println("Resto da divisao:"+ restodiv);
       // exibe na tela a explicacao sobre a variavel do resto da divisao
    }
    
}