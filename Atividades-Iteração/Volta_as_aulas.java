import java.util.Scanner;
public class Volta_as_aulas {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        
        System.out.print("Digite um numero real:");
        double primeiro = leitor.nextDouble();
        
        System.out.println("Digite outro numero real:");
        double segundo = leitor.nextDouble();
        
        double soma = (primeiro + segundo);
        double diferenca = (primeiro - segundo);
        double multiplicacao = (primeiro * segundo);
        
        System.out.println("Aqui estao os resultados de soma, diferenca e multiplicacao:");
        System.out.println("Soma:"+ soma);
        System.out.println("Diferenca: "+ diferenca);
        System.out.println("Multiplicacao: "+ multiplicacao);
        
        
        
    }
    
}
