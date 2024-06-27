import java.util.Scanner;
public class Terceiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um texto/frase: ");
        String texto = leitor.nextLine();
        
        int branco = texto.indexOf(' ');
        
        if(branco != -1){
            String saida = texto.substring(0, branco);
            System.out.println(saida);
        } 
    }
}
