import java.util.Scanner;
public class TesteStatic {
    private static Scanner leitor = new Scanner (System.in);
    private static int valor1, valor2;
    private static int soma, diferenca, produto, quociente;
    
    public static void leituraDados(){
        System.out.print("Digite o primeiro valor: ");
        valor1 = leitor.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = leitor.nextInt();
    }
    
    public static void processamento(){
        soma = valor1 + valor2;
        diferenca = valor1 - valor2;
        produto = valor1*valor2;
        quociente = valor1/valor2;
    }
    
    public static void relatorioSaida(){
        System.out.println("Soma: " +  soma);
        System.out.println("Diferenca: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
    }
    
    public static void main(String[] args) {
        leituraDados();
        processamento();
        relatorioSaida();
    }
}
