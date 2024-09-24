public class BubbleSort_APNP {
    public static void sort(int vetor[]){
        int comparacoes = 0;
        int trocas = 0;
        long comeco = System.nanoTime();
        
        for(int i =0; i < vetor.length -1; i++){
            
            for( int j = 0; j < vetor.length -1 -i; j++ ){
                comparacoes++;
                
                if(vetor[j] > vetor[j+1]){
                    trocas++;
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }    
            }
        }
        long fim = System.nanoTime();
        long tempo = fim-comeco;
        
        System.out.println("BubbleSort levou "+comparacoes+" comparacoes para organizar um vetor de tamanho 50");
        System.out.println("BubbleSort fez "+trocas+" trocas para organizar um vetor de tamanho 50");
        System.out.println("BubbleSort levou "+tempo+" nano segundos para organizar um vetor de tamanho 50");
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] ordenados = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
            26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        
        BubbleSort_APNP.sort(ordenados);
        
        int[] inversos = {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25,
            24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        BubbleSort_APNP.sort(inversos);
        
        int[] aleatorios = {11, 39, 6, 24, 18, 4, 48, 10, 29, 27, 36, 50, 22, 14, 45, 25, 8, 2, 21, 46, 33, 12, 41, 1, 17, 35, 5,
            38, 43, 40, 26, 47, 16, 31, 30, 9, 20, 42, 7, 37, 34, 23, 32, 13, 19, 49, 44, 15, 3, 28};
        
        BubbleSort_APNP.sort(aleatorios);
    }
}