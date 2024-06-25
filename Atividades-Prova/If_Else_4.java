import java.util.Scanner;
public class If_Else_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite uma Letra: ");
        
        String letra = leitor.nextLine();
        String vog1 = "A";
        String vog2 = "E";
        String vog3 = "I";
        String vog4 = "O";
        String vog5 = "U";
        
        
        if(letra.equalsIgnoreCase(vog2)||letra.equalsIgnoreCase(vog3)||letra.equalsIgnoreCase(vog4)
                ||letra.equalsIgnoreCase(vog5)||letra.equalsIgnoreCase(vog1)){
            System.out.println("Voce digitou uma vogal");
        }else{
            System.out.println("Voce digitou uma consoante");
        }
    }
}
