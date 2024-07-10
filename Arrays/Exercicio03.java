import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        //Algoritmo de busca linear de Arrays
        int valores[] =
        {
          10,20,890,-6,5,95,9,6,78,32
        };
        
        
        System.out.println("Digite o valor de busca: ");
        int numero = leitor.nextInt();
        
        int indice;
        for(indice = 0; indice < valores.length && numero != valores[indice]; indice++){
        }
        if(indice == valores.length){
            System.out.println("Não encontrei o elemento");
        } else{
            System.out.println("O elemento esta na posicao"+ indice);
        }
    }
}
