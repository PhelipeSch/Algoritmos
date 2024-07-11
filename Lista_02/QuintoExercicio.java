import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        
        double valor = leitor.nextDouble();
        double parar = valor + 10;
        
        System.out.print(valor + ", ");
        
        while(valor < parar){
            
            valor++;
            System.out.print(valor + ", ");
        }
    }
    
}
