import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio_Sala_Mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList <String> produto = new ArrayList();
        ArrayList <Integer> quantidadeAll = new ArrayList();
        ArrayList <Double> preco = new ArrayList();
        ArrayList <Double> precoTotal = new ArrayList();
        int totalItens = 0;
        int total =0;
        
        System.out.println("Digite a descrição do item: ");
        String descricao = leitor.nextLine();
        
        while( !descricao.equals("fim") ){
            
            System.out.println("Digite a quantidade dele: ");
            int quantidade = leitor.nextInt();
            
            System.out.println("Digite o valor unitário: ");
            double valorUnit = leitor.nextDouble();
            
            double valor = quantidade * valorUnit;
            leitor.nextLine();
            
            produto.add(descricao);
            quantidadeAll.add(quantidade);
            preco.add(valorUnit);
            precoTotal.add(valor);
            
            System.out.println("Digite a descrição do item: ");
            descricao = leitor.nextLine();
            
            System.out.println("Digite a quantidade dele: ");
            quantidade = leitor.nextInt();
            
            System.out.println("Digite o valor unitário: ");
            valorUnit = leitor.nextDouble();
            leitor.nextLine();
            
            System.out.println("Digite a descrição do item: ");
            descricao = leitor.nextLine();
        }
        
        for(int i =0; i < produto.size(); i++){
            totalItens += quantidadeAll.get(i);
            total += precoTotal.get(i);
        }
        
        File arqSaida = new File("NotaFiscal.txt");
        PrintWriter escritor = null;
        
        try{
            escritor = new PrintWriter(arqSaida);
            
            for(int i =0; i < produto.size(); i++){
                escritor.printf("%s %2d %2.2f %2.2f\n", 
                    produto.get(i), 
                    quantidadeAll.get(i), 
                    preco.get(i),
                    precoTotal.get(i));
            }
            System.out.println("Total de itens: " + totalItens);
            System.out.println("Valor total: " + total);
        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        } finally{
            if(escritor != null){
                escritor.close();
            }
        }
    }    
}
/*
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter fw = new FileWriter("produtos.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {

            int totalQuantidade = 0;
            double totalValor = 0.0;

            while (true) {
                System.out.println("Digite a descrição do produto (ou 'fim' para terminar):");
                String descricao = scanner.nextLine();
               
                if (descricao.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.println("Digite a quantidade do produto:");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite o valor unitário do produto:");
                double valorUnitario = Double.parseDouble(scanner.nextLine());

                double valorTotalProduto = quantidade * valorUnitario;

                // Escreve no arquivo a descrição, quantidade e valor unitário
                pw.printf("%s, %d, %.2f%n", descricao, quantidade, valorUnitario);
               
                // Atualiza os totais
                totalQuantidade += quantidade;
                totalValor += valorTotalProduto;
            }

            // Escreve os totais no arquivo
            pw.printf("Total de produtos: %d%n", totalQuantidade);
            pw.printf("Valor total: %.2f%n", totalValor);

            System.out.println("Dados gravados com sucesso no arquivo 'produtos.txt'.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
*/