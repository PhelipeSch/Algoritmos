import java.util.Scanner;
public class AtvCasa2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Bom dia escolha o que você quer fazer:");
        System.out.println("[1] Voltar a dormir e apos que acordar jogar video game.");
        System.out.println("[2] Pegar um onibus lotado com todas as pessoas fedendo.");
        
        int res = leitor.nextInt();
        
       for(int doit=1; doit<=10000001; doit++){
            if( res == 1){
                System.out.println("Bom dia escolha o que você quer fazer:");
                System.out.println("[1] Voltar a dormir e apos que acordar jogar video game.");
                System.out.println("[2] Pegar um onibus lotado com todas as pessoas fedendo.");
            }
       }
    }
}
