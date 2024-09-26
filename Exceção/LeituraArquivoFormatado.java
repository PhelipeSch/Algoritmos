import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
public class LeituraArquivoFormatado {
    public static void main(String[] args) {
        File arqLeitura = new File("notas.txt");
        Scanner leitor = null;
        
        ArrayList<Integer> codMatricula = new ArrayList();
        ArrayList<Double> notas1 = new ArrayList();
        ArrayList<Double> notas2 = new ArrayList();
        ArrayList<Integer> faltas = new ArrayList();
        
        try{
            leitor = new Scanner(arqLeitura);
            
            //Leitura para um arquivo formatado
            while(leitor.hasNext()){ //hasNext pede se tem mais algo para ler
                codMatricula.add( leitor.nextInt() );
                notas1.add( leitor.nextDouble() );
                notas2.add( leitor.nextDouble() );
                faltas.add( leitor.nextInt() );
                
            }
            System.out.println(codMatricula.size() );
        }catch(FileNotFoundException exc){
            exc.printStackTrace();
            
        }finally{
            if(leitor != null){
                leitor.close();
            }
        }
        for(int i =0; i < codMatricula.size(); i++){
            System.out.printf("%7d %5.2f %4.1f %02d\n", codMatricula.get(i), notas1.get(i), notas2.get(i), faltas.get(i) );
//d = inteiro decimal f = ponto flutuante (real) 7,4,2 = numero de digitos a imprimir .1 = uma casa decimal após a vírgula \n = nova linha
        }
    }
}
