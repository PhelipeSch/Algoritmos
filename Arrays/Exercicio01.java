import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String [] nomes = new String [10];
        double[][] notas = new double [10][2];
        
        for(int i = 0; i<10; i++){
            nomes [i] = leitor.nextLine();
        }
        for(int a = 0; a<10; a++){
            System.out.println("Notas de " + nomes[a]);
            for(int n=0; n<2; n++){
                notas [a][n] = leitor.nextDouble();
            }
        }
        double[] mediaAluno = new double [10];
        double[] mediaAvaliacao = new double [2];
        double mediaGeral = (mediaAvaliacao[0] + mediaAvaliacao[1])/2.0;
        
        
        System.out.println("Media do aluno: " + mediaAluno[7]);
        System.out.println("Media Avaliacao: " + mediaAvaliacao[1]);
        System.out.println("Media geral: " + mediaGeral);
    }
    
}
