import java.util.Scanner;
public class LaçoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero,soma=0;
        numero = leitor.nextInt();
        while(numero>0){
            
            soma = soma + numero;
            numero = leitor.nextInt();
        }
        System.out.println("Soma = " + soma);
        
    }
    
}
