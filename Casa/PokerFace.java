import java.util.Scanner;
public class PokerFace {
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       
       System.out.print("Digite a primeira nota da(o)estudante: ");
       double nota01 = leitor.nextDouble ();  
       
       System.out.print("Digite a segunda nota da(o) estudante: ");
       double nota02 = leitor.nextDouble ();
       
       System.out.print("Digite a terceira nota da(o) estudante: ");
       double nota03 = leitor.nextDouble ();
       
       double soma = nota01+nota02+nota03;
       
       double media = (soma/3);
       
       if (media >= 7){
        System.out.println("Aprovada(o)!!!!!!!!!!!");
        System.out.println(media);
      
       } else {
           System.out.println("Reprovada(o)!!!!!!!!!!");
           System.out.println(media);
      
       }
    }
}
