import java.util.Scanner;

public class Leitura04 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
   System.out.println("Primeira nota:");
        double nota1 = leitor.nextInt();
   System.out.println("Segunda nota:");
        double nota2 = leitor.nextInt();
   System.out.println("Terceira nota;");
        double nota3 = leitor.nextInt();
   
   double soma = nota1+nota2+nota3;
   
   double media = (soma/3);
  
   System.out.println("Resultado soma das notas:"+ soma);
   System.out.println("Media das notas:"+  media);
   //Esse código ele faz uma soma de tres variaveis e tambem faz uma media aritmetica, 
   // atraves do scanner sao feitas essas operacoes primeiro sao declaradas essas variaveis, apos sao armazenadas e é feita a soma delas por fim é feita a media aritmetica delas e exibida na tela.
    }
    
    
}
