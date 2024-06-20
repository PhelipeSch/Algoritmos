import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        
        int numero, soma= 0;
       
        for( int i=1;  i<=10; i++){
            System.out.print(i+": ");
            numero = leitor.nextInt();
            soma = soma+ numero;
        }
        System.out.println("Soma= " + soma);
    }
    
}
