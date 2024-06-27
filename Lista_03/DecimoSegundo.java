import java.util.Scanner;
public class DecimoSegundo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String mensagem;
        while( ! (mensagem = leitor.nextLine().toLowerCase() ).equals("tchau") ){
            
            for(int ind=0; ind<mensagem.length(); ind++){
                char caractere = mensagem.charAt(ind);
                System.out.print(caractere);
                
                switch(caractere){
                    case'a':
                    case'e': 
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Vogal ");
                    break;
                    case'b':
                    case'c':
                    case'd':
                    case'f':
                    case'g':
                    case'h':
                    case'j':
                    case'k':
                    case'l':
                    case'm':
                    case'n':
                    case'p':
                    case'q':
                    case'r':
                    case's':
                    case't':
                    case'v':
                    case'w':
                    case'x':
                    case'y':
                    case'z':
                        System.out.println(" Consoante ");
                    break;
                    default:
                        System.out.println(" Invalido ");
                    break;
                }
            }
        }
    }
    
}
