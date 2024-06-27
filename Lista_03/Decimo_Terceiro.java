import java.util.Scanner;
public class Decimo_Terceiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        double altInicial = 1.5;
        
        double altAtual = altInicial;
        double taxaCresc = leitor.nextDouble();
        double altFinal = leitor.nextDouble ();
        int ano = 0;
        
        while( altAtual < altFinal){
            ano++;
            altAtual= altAtual*(1.0 + taxaCresc/100.0);
            System.out.println("Ano " + ano + ": " + altAtual);
        }
    }
}
