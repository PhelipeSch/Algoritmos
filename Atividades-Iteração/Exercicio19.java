import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Valor do produto:");
        double valor = leitor.nextInt ();
        
        if( valor >= 120 ) {
          double ValorTotal = (valor + 15.00);
            System.out.println("O valor total eh de: R$" + ValorTotal);
    }else{
            System.out.println("O valor permanece o mesmo: R$" + valor);
        }
        
    }
    
}
