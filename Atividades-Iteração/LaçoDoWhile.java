import java.util.Scanner;
public class LaçoDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero,soma=0;
        do{
            numero= leitor.nextInt();
            soma = soma +numero;
            
        }while(numero > 0);
        System.out.println("soma=" + soma
        );
        
    }
    
}
