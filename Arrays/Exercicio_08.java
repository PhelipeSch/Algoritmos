
import java.util.Arrays;


public class Exercicio_08 {
    static final int TAMANHO = 10_000_000;
    static int[] vetor = new int [TAMANHO];
    
    public static void main(String[] args) {
        for(int i=0; i<vetor.length; i++){
            vetor[i] = (int) Math.rint(Math.random() *1_000_000);
        }
        Arrays.sort(vetor);
        // Busca Binaria
        //Nesse teste, vamos grerar numeros açeatorios e pesquisar no vetor
        //Serão realizadas 100 buscas, medido o tempo de cada uma e a quantidade
        // de comparacoes realizadas
        
        for(int i =0; i< 100; i++){
            int comp =0;
            int numero = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio = System.currentTimeMillis();
            int primeiro = 0, ultimo = vetor.length-1;
            int pivo;
            do{
                pivo = (primeiro+ ultimo)/2;
                
                if(numero < vetor[pivo]){
                   ultimo = pivo-1; 
                }else{
                    
                    if(numero > vetor[pivo]);
                        primeiro = pivo +1;
                    }
                comp++;
            }while(numero != vetor[pivo] && primeiro <= ultimo);
            
            long fim = System.currentTimeMillis();
            if(comp <= 11){
                System.out.println("Comparacoes: "+ comp);
            }
        }
    }
    
}
