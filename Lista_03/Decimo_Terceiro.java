import java.util.Scanner;
public class Decimo_Terceiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double altInicial = 1.5;
        double altAtual = altInicial;
        
        System.out.println("Digite a taxa de crescimento de uma arvore em %: ");
        double taxaCresc = leitor.nextDouble();
        
        System.out.println("Digite a altura maxima desejada: ");
        double altFinal = leitor.nextDouble ();
        
        int ano = 0;
        
        while( altAtual < altFinal){
            ano++;
            altAtual= altAtual*(1.0 + taxaCresc/100.0);
            System.out.println("Ano " + ano + ": " + altAtual);
        }
    }
}
