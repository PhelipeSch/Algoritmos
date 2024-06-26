import java.util.Scanner;
public class Decimo_Primeiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        while(true){
            System.out.print("Digite um numero: ");
            double primeiro = leitor.nextDouble();
            
            if(primeiro == 0){
                break;
            }
            
            System.out.print("Digite outro numero: ");
            double segundo = leitor.nextDouble();
            
            if(segundo == 0){
                break;
            }
            
            double menor = Math.min(primeiro, segundo);
            double maior = Math.max(primeiro, segundo);
            
            double soma = 0;
            
            System.out.println("Essa eh a sequencia entre esses numeros: ");
            for(double i = menor; i <= maior; i++){
                System.out.println(i + ", ");
                soma += i;
            }
            System.out.println("A soma dessa sequecencia eh de: " + soma);
        }
    }
}
