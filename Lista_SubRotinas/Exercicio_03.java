import java.util.Scanner;
public class Exercicio_03 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void Leitor_Menor_e_Maior(){
        double vetor[] = new double [5];
        double maximo, minimo, Atual;
        
        System.out.println("Digite um valor real: ");
        maximo = minimo = leitor.nextInt();
        
        for(int i =1; i<5; i++){
            System.out.println("Digite um valor real: ");
            Atual = leitor.nextDouble();
            vetor[i]=Atual;
            if( Atual > maximo ) {
                maximo = Atual;
            } else {
                
                if( Atual < minimo ) {
                    minimo = Atual;
                }
            }
        }
    }
}
/*
Escreva um novo programa, alterando o exercício 1, pesquisando qual é o menor e o maior dos 50 números.
*/