import java.util.InputMismatchException;
import java.util.Scanner;
public class ExcecaoNaoVerificada {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int valor;
        boolean digitacao_ok = true;
        
        do{
        try{
            digitacao_ok = true;
           valor = leitor.nextInt();
        }catch (InputMismatchException exc){
            
            digitacao_ok = false;
            System.out.println("digite um valor valido!");
            
            leitor.nextLine();
        }
        }while(!digitacao_ok);
        System.out.println("Programa ok");
        
    }
}
