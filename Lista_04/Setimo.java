import java.util.Scanner;
public class Setimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um numero de telefone: ");
        String numero = leitor.nextLine();
        
        for(int i=0; i<=numero.length() - 1; i++) {
            char caractere = numero.charAt(i);
            
            if(i == 0) {
                System.out.print("("+caractere);
            }else{
                if(i == 1) {
                    System.out.print(caractere+")");
                }else{
                    if(i == 5) {
                        System.out.print(i + "-");
                    }else {
                        System.out.print(caractere);
                    }
                } 
                    
            }
        }
    }
}
