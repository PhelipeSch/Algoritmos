import java.util.Scanner;
public class NonoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite valores quando quiser parar digite 0: ");
        
        int valor;
        int ContPos = 0;
        int ContNeg = 0;
       
        
        while((valor = leitor.nextInt()) != 0){
            
            if(valor > 0){
                
                ContPos++;
            
            }
            if( valor < 0){
                
                ContNeg++;
            }
        }
        int total = ContPos + ContNeg;
        int PercentualPos = (ContPos * 100) / total;
        int PercentualNeg = (ContNeg * 100) / total;
        System.out.println("Foram digitados " + ContPos + " numeros positivos o que equivale a " + PercentualPos + "%");
        System.out.println("Foram digitados " + ContNeg + " numeros negativos o que equivale a " + PercentualNeg + "%");
    }
}