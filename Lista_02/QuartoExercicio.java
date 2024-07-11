import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int DentroInterv = 0;
        int ForaInterv = 0;
        
        for( double i =0; i<10;i++){
            
            System.out.println("Digite um valor:");
           
            double valor = leitor.nextDouble();
            
            if(valor>=10 && valor<20){
                
                DentroInterv++;
            } else{
                
                ForaInterv++;
            }
        }
        System.out.println(DentroInterv + " desses numeros foram entre 10 e 20");
            
        System.out.println(ForaInterv + " desses numeros nao foram entre 10 e 20");
    }
    
}
