import java.util.ArrayList;
import java.util.Scanner;
public class Exercico_Sala_Mercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList <String> produto = new ArrayList();
        ArrayList <Integer> quantidadeAll = new ArrayList();
        ArrayList <Double> preco = new ArrayList();
        ArrayList <Double> precoTotal = new ArrayList();
        int totalItens = 0;
        
        String descricao = leitor.nextLine();
        while(!descricao.equals("fim") ){
            int quantidade = leitor.nextInt();
            double valorUnit = leitor.nextDouble();
            double valor = quantidade * valorUnit;
            
            produto.add(descricao);
            quantidadeAll.add(quantidade);
            preco.add(valorUnit);
            precoTotal.add(valor);
            
            leitor.nextLine();
            descricao = leitor.nextLine();
            quantidade = leitor.nextInt();
            valorUnit = leitor.nextDouble();
        }
    }    
}
