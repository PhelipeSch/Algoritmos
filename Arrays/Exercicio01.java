import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        //Declarou e criou os Arrays 
        String[] nomes = new String[10];
        double[][] notas = new double[10][2];
        
        //1º laço para pedir o nome dos alunos pelo teclado
        for(int i = 0; i < nomes.length; i++ ) {
           
            System.out.println("Digite o nome do "+ i +" aluno:");
            nomes[i] = leitor.nextLine();
        }
        
        //2º e 3º laços para pedir as duas notas dos alunos pelo teclado
         for(int alunos = 0; alunos < notas.length; alunos++) {
           
            System.out.println("Notas de " + nomes[alunos]);
           
            //Esse laço mais de dentro que faz a leitura e guarda as notas
            for(int avaliacao = 0; avaliacao < notas[alunos].length; avaliacao++) {
                
                notas[alunos][avaliacao] = leitor.nextDouble();
            }
        }
         //Cria os Arrays de medias
        double[] mediaAluno = new double[ notas.length ];
        double[] mediaAvaliacao = new double[ 2 ];
        double mediaGeral;
        
        //4º e 5º laços soma as notas para futuramente fazer as medias
        for(int alunos = 0; alunos < notas.length; alunos++) {
            
            for(int avaliacao=0; avaliacao< notas[alunos].length; avaliacao++) {
                
                mediaAluno[alunos] += notas[alunos][avaliacao];
                mediaAvaliacao[avaliacao] += notas[alunos][avaliacao];
            }
            mediaAluno[alunos] /= notas[alunos].length;
        }
        
        //Faz as medias das avaliacoes e a media geral da turma
        mediaAvaliacao[0] /= notas.length;
        mediaAvaliacao[1] /= notas.length;
        mediaGeral = (mediaAvaliacao[0] + mediaAvaliacao[1]) / 2;
       
        //Cria os Arrays de maior e menor media
        double max = mediaAluno[0];
        double min = mediaAluno[0];
        
        //O 6º laço atribui valor aos Arrays de maior e menor nota
        for(int avaliacao=1; avaliacao < mediaAluno.length; avaliacao++){
           
            if(max < mediaAluno[avaliacao]){
                max = mediaAluno[avaliacao];
            }
            if(min > mediaAluno [avaliacao]){
                min = mediaAluno[avaliacao];
            }
        }
        
        //Cria os Arrays de maior e menor nota
        double[] maxNota = new double[2];
        double [] minNota = new double [2];
        
        //O 7º laço atribui valor aos Arryas de maior e menor nota
        for(int avaliacao = 0; avaliacao< maxNota.length; avaliacao++){
           
            maxNota [avaliacao] = notas [0] [avaliacao];
            minNota[avaliacao] = notas[0][avaliacao];
        }
       
        //Os 8º e 9º laços atribuem valores aos Arrays de maior e menor notas
        for(int alunos = 1; alunos > notas.length; alunos++){
           
            for(int avaliacao = 0; avaliacao< notas[alunos].length; avaliacao++){
               
                if(maxNota[avaliacao] < notas[alunos][avaliacao]){
                    maxNota[avaliacao] = notas[alunos][avaliacao];
                }
                if(minNota[avaliacao]> notas[alunos][avaliacao]){
                    minNota[avaliacao] = notas [alunos][avaliacao];
                }
            }
        }
        
        //Cria os contadores de alunos acima e abaixo da média
        int contadorAcima = 0;
        int contadorBaixo = 0;
       
        //10º laço atribui valor aos contadores
        for(int i = 0; i < mediaAluno.length; i++){
            
            if(mediaAluno[i] > mediaGeral){
                contadorAcima++;
            }
            if(mediaAluno[i] < mediaGeral){
                contadorBaixo++;
            }
        }
        
        //Imprime os dados obtidos no programa 
        System.out.println(mediaGeral);
        System.out.println(contadorAcima);
        System.out.println(contadorBaixo);
    }
}
