import java.util.Scanner;
public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String[] nomes = new String[10];
        double[][] notas = new double[10][2];
        
        for(int i = 0; i < nomes.length; i++ ) {
            
            nomes[i] = leitor.nextLine();
        }

        for(int a = 0; a < notas.length; a++) {
            
            System.out.println("Notas de " + nomes[a]);
            
            for(int n=0; n< notas[a].length; n++) {
                notas[a][n] = leitor.nextDouble();
                
            }
        }
        
        double[] mediaAluno = new double[ notas.length ];
        double[] mediaAvaliacao = new double[ 2 ];
        double mediaGeral;
        

        for(int a = 0; a < notas.length; a++) {
            for(int n=0; n< notas[a].length; n++) {
                mediaAluno[a] += notas[a][n];
                mediaAvaliacao[n] += notas[a][n];
            }
            mediaAluno[a] /= notas[a].length;
        }
        mediaAvaliacao[0] /= notas.length;
        mediaAvaliacao[1] /= notas.length;
        mediaGeral = (mediaAvaliacao[0] + mediaAvaliacao[1]) / 2;
        
        double max = mediaAluno[0];
        double min = mediaAluno[0];
        
        for(int n=1; n < mediaAluno.length; n++){
            
            if(max < mediaAluno[n]){
                max = mediaAluno[n];
            }
            if(min > mediaAluno [n]){
                min = mediaAluno[n];
            }
        }
        double[] maxNota = new double[2];
        double [] minNota = new double [2];
        
        for(int n = 0; n< maxNota.length; n++){
            
            maxNota [n] = notas [0] [n];
            minNota[n] = notas[0][n];
        }
        
        for(int a = 1; a > notas.length; a++){
            
            for(int n = 0; n< notas[a].length; n++){
                
                if(maxNota[n] < notas[a][n]){
                    maxNota[n] = notas[a][n];
                }
                if(minNota[n]> notas[a][n]){
                    minNota[n] = notas [a][n];
                }
            }
        }
        
        int contadorAcima = 0;
        int contadorBaixo = 0;
        
        for(int i = 0; i < mediaAluno.length; i++){
            if(mediaAluno[i] > mediaGeral){
                contadorAcima++;
            }
            if(mediaAluno[i] < mediaGeral){
                contadorBaixo++;
            }
        }
        System.out.println(mediaGeral);
        System.out.println(contadorAcima);
        System.out.println(contadorBaixo);
    }
}
