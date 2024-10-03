import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_Sala_Mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<Double> precosUnitarios = new ArrayList<>();
        ArrayList<Double> precosTotais = new ArrayList<>();
        int totalItens = 0;
        double total = 0.0;

        while (true) {
            System.out.println("Digite a descrição do item ou fim para encerrar: ");
            String descricao = leitor.nextLine();
            
            if (descricao.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a quantidade dele: ");
            int quantidade = leitor.nextInt();

            System.out.println("Digite o valor unitário: ");
            double valorUnitario = leitor.nextDouble();
            leitor.nextLine(); 

            double valorTotal = quantidade * valorUnitario;

            produtos.add(descricao);
            quantidades.add(quantidade);
            precosUnitarios.add(valorUnitario);
            precosTotais.add(valorTotal);

            totalItens += quantidade;
            total += valorTotal;
        }

        File arqSaida = new File("NotaFiscal.txt");
        
        try(PrintWriter escritor = new PrintWriter(arqSaida);){
            for (int i = 0; i < produtos.size(); i++) {
                escritor.printf("%-20s\t %3d\t %,8.2f\t %,9.2f\n", 
                        produtos.get(i), 
                        quantidades.get(i), 
                        precosUnitarios.get(i), 
                        precosTotais.get(i));
            }
            escritor.printf("Total de itens: %4d\n", totalItens);
            escritor.printf("Valor total: %9.2f\n", total);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } finally {
            leitor.close();
        }
    }
}
