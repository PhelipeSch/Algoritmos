import java.util.Scanner;
public class CalculoRaizQuadrada {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        int numero = leitor.nextInt();
        
        if( numero>=0 ) { // número é NÂO negativo
            double raiz = Math.sqrt( numero);
            System.out.println(raiz);
        }
    }
}