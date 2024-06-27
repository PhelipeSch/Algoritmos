import java.util.Scanner;
public class Quarto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um texto/frase para saber seu comprimento: "); 
        String texto = leitor.nextLine();
        
        
        int comprimento = texto.length();
        
        System.out.println("O comprimento do seu texto eh de: " + comprimento);
       
    }
    
}
