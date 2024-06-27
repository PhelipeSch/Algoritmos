import java.util.Scanner;
public class Sexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um texto: ");
        String texto = leitor.nextLine();
        
        for(int i=0; i<=texto.length()-1; i++) {
            char digitos = texto.charAt(i);
            
            System.out.print(digitos + "-");
        }
    } 
}
