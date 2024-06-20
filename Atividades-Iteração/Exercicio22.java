import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args){
        Scanner leitor  = new Scanner (System.in);
        
        System.out.println("Digite os segundos: ");
        int Seg = leitor.nextInt ();
        
        int Min = Seg / 60;
        int Hora = Min / 60;
        int Dia =  Hora / 24;
        
        System.out.println("");
                
    }
    
}
