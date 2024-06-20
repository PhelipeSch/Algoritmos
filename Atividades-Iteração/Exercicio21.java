import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um ano:");
        int Ano = leitor.nextInt ();
        int quatro = Ano % 4;
        int cem = Ano % 100;
        int quatrocentos = Ano % 400;
        
        if (quatro == 0 && (cem != 0) || quatrocentos == 0) {
            System.out.println("Eh um ano Bisexto");
        } else {
            System.out.println("Nao eh um ano Bisexto");
        }
        
    }
}
