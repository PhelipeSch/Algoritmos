import java.util.Scanner;
public class Exercicio_07 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void Leitor_e_Busca_Linear(){
        int vetor[] = new int [7];
        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite um valor inteiro entre 1 e 99: ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou o valor errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou o valor errado");
                    i--;
                }else{
                    vetor[i]=valor;
                }
            }
        }
        System.out.println("");
        System.out.println("Digite o numero que deseja buscar: ");
        int misterio = leitor.nextInt ();
        
        int i;
        for(i = 0; i < vetor.length && misterio != vetor[i]; i++){
        }
        
        if(i == vetor.length){
            System.out.println("Nao achei o numero desejado!");
        }else{
            System.out.println("Achei o numero e ele esta na posicao " + i + " do vetor.");
        }
    }
}
/*
Escreva um novo programa, alterando o exercício 6, e leia mais um número inteiro e verifique se ele é igual a algum dos anteriores.
*/