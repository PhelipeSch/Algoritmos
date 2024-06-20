import java.util.Scanner;
public class Execício18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o numero de horas do congrsso:");
        int NumHoras = leitor.nextInt();
        
        System.out.println("Digite o numero de horas comparecidas:");
        int Presensa = leitor.nextInt();
        
        double frequencia =  Presensa / (double) NumHoras;
      
     
        if(  frequencia >= 0.75 ) { 
            System.out.println("Emita o certificado");
            } else {
            System.out.println("Nao emita o certificado");
                
                
        
    }
  }
}
