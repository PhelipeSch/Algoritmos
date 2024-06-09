import java.util.Scanner;
public class MetBasal {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        System.out.print("Digite 0 se for Mulher e 1 se for Homem:");
        int genero = leitor.nextInt ();
         System.out.println("Quilos em Kg: ");
            double quilos = leitor.nextDouble ();
        
            System.out.print("Altura em cm: ");
            double altura = leitor.nextDouble ();
        
            System.out.println("Idade em anos: ");
            double idade = leitor.nextDouble ();

        if(genero < 1){
            double primeiro = (9.6 * quilos);
            double segundo = (1.8 * altura);
            double terceiro = (4.7 * idade);   
        
            double contaM = (665+(primeiro)+(segundo)-(terceiro));
            
            System.out.println("Numero de calorias que seu corpo usa somente para estar vivo: " + contaM);
        } else{  
            double primeiro = (13.7 * quilos);
            double segundo = (5.0 * altura);
            double terceiro = (6.8 * idade);   
        
            double contaH = (66+(primeiro)+(segundo)-(terceiro));
            
            System.out.println("N de calorias que seu corpo usa somente para estar vivo: " + contaH);
        }
        
    }
}
