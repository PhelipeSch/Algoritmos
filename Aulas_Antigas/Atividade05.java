public class Atividade05 {
    public static void main(String[] args) {
       int qntproduto1=5;
       int qntproduto2=3;
       double preproduto1=15;
       double preproduto2=35;
       double precompra1=(qntproduto1*preproduto1);
       double precompra2=(qntproduto2*preproduto2);
               
       System.out.println("Preco total de compra produto 1: " + (qntproduto1*preproduto1));
       System.out.println("Preco total de compra produto 2: " + (qntproduto2*preproduto2));
       System.out.println("Total geral dos produtos: " + (precompra1+precompra2) );
       //Esse codigo le e armazena os valores unitarios e quantidades de alguns produtos, soma o preco que e pago no item 1 (toda a quantidade de itens)e no item 2 a mesma cois e faz a soma total dos produtos comprados.
    }
}