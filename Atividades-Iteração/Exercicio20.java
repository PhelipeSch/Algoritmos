import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um ano:");
        int Ano = leitor.nextInt ();
        
         int resto = Ano % 4;
         
         if( resto == 0 ) {
            System.out.println("Eh um ano Bisexto!!");
    }else{
            System.out.println("Nao eh um ano Bisexto!!");
        }

    
    }
}
