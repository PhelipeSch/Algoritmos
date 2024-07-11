import java.util.Scanner;
public class Exercio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        /*
        Considere um Vetor V, cujo 1º elemento tem índice INICIO e o ultimo, FIM. V está ordenado crescentemente. 
        A operação de busca binária consiste em localizar o valor CHAVE no vetor.
        O procedimeto consiste em identificar o índice do elemento central, em identificar o índice do elemento central, PIVO e comparar V[PIVO] com a CHAVE.
        Se a CHAVE for maior, descarta-se a metade "inferior" e passa-se a realizar a busca no novo subvetor, que é metade do anterior.
        Caso a CHAVE seja menor, destaca-se a metade "Superior". E assim, sucessivamente, até que se encontre a CHAVE em V ou o INICIO seja maior que o FIM.
        CHAVE = o que quer se achar
        INICIO = primeiro valor do Array
        FIM = ultimo valor do Array
        Pivo = (inicio + fim)/2
        */
        int v [] = {3,4,9,11,15,22,37,48,53,61,79,81,94,101,110,115};
        int inicio = 0;
        int fim = v.length-1;
        int pivo;
        
        System.out.println("Digite um valor a ser encontrado: ");
        int chave = leitor.nextInt();
        
        do{
            pivo = (inicio+fim)/2;
            
            if(chave > v[pivo]){
                inicio = pivo+1;
            }else{
                if(chave < v[pivo]){
                   fim = pivo -1; 
                }
            }
        }while(chave != v[pivo] && inicio <= fim);
        if(inicio>fim){
            System.out.println("Nao foi encontrado");
        }else{
            System.out.println("Encontrado na posicao " + (pivo+1));
        }
    }
}
