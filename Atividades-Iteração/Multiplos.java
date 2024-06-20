import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor:");
        int numero = teclado.nextInt();
        
        int resto1 = numero % 3;
        int resto2 = numero % 5;
        int resto3 = numero % 7;
         
        if (resto1 == 0) {
            System.out.println("Multiplo de 3");
        } else {
            System.out.println ("Nao e multiplo de 3");
        }
        if (resto2 == 0) {
            System.out.println("Multiplo de 5");
        } else {
            System.out.println ("Nao e multiplo de 5");
        }
        if (resto3 == 0) {
            System.out.println("Multiplo de 7");
        } else {
            System.out.println ("Nao e multiplo de 7");
        }
        
        
    }
    
    
}
