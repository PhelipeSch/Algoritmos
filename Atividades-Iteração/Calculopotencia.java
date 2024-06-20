import java.util.Scanner;
public class Calculopotencia {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        System.out.print("Digite um numero:");
        double numero = leitor.nextInt();
        
        if( numero>=0 ) { // número é NÂO negativo
            double potencia = Math.pow( numero,3);
            System.out.println(potencia);
        }
    }
}
