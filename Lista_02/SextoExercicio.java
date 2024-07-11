import java.util.Scanner;
public class SextoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        float maior;
        float menor;
        float valorMoment; 
        
        System.out.println("Insira 20 numeros reais: ");
        maior = menor = leitor.nextInt();
        
        for(int i= 1; i<20; i++) {
            
            valorMoment = leitor.nextInt();
            
            if( valorMoment > maior ) {
                
                maior = valorMoment;
            } else {
                
                if( valorMoment < menor ) {
                    menor = valorMoment;
                }
            }
        }
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
        
    }
    
}
