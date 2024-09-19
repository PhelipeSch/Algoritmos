public class BubbleSort {
    public static void sort(int[] vetor){
        //Rodadas de Comparação
        for(int i =0; i < vetor.length -1; i++){
            //Sequencia de comparações por rodada
            for( int j = 0; j < vetor.length -i -1; i++ ){
                if(vetor[j] > vetor[j+1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }    
            }
        }
    }
    public static void main(String[] args) {
        int[] numeros = GeradorAleatorio.geraInt(20,0,1000);
        
        for(int numero: numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
        
        BubbleSort.sort(numeros);
        
        for(int numero: numeros){
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
