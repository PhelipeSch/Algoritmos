import java.util.Scanner;

public class Leitura05 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade do primeiro produto:");
        int qntproduto1 = leitor.nextInt();
        System.out.println("Quantidade do segundo produto:");
        int qntproduto2 = leitor.nextInt();
        
        System.out.println("Preco do primeiro produto:");
        double preproduto1 = leitor.nextInt();
        System.out.println("Preco do segundo produto:");
        double preproduto2 = leitor.nextInt();
        
        double precompra1 = (qntproduto1*preproduto1);
        double precompra2 = (qntproduto2*preproduto2);
        
        double total = (precompra1+precompra2);
        
        System.out.println("Subtotal do preco de compra do primeiro produto:" + precompra1);
        System.out.println("subtotal do preco de compra do segundo produto:" + precompra2);
        System.out.println("Total dos dois produtos:"+ total);
     
    }
    
}
