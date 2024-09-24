public class MergeSort_APNP {
    private static int comparacoes = 0;
    private static int trocas = 0;
    
    public static void mergeSort(int vetor[]) {
        comparacoes = 0;
        trocas = 0;
        long comeco = System.nanoTime();

        dividir(vetor, 0, vetor.length - 1);

        long fim = System.nanoTime();
        long tempo = fim-comeco;
        
        System.out.println("MergeSort levou "+comparacoes+" comparacoes para organizar um vetor de tamanho 50");
        System.out.println("MergeSort fez "+trocas+" trocas para organizar um vetor de tamanho 50");
        System.out.println("MergeSort levou "+tempo+" nano segundos para organizar um vetor de tamanho 50");
        System.out.println("");
    }

    public static void dividir(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            dividir(vetor, inicio, meio);
            dividir(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public static void merge(int Valores[], int inicio, int meio, int fim) {
        int i = inicio;
        int q = meio + 1;
        int r = inicio;
        int[] temp = new int[Valores.length];

        while (i <= meio && q <= fim) {
            comparacoes++;
            if (Valores[i] <= Valores[q]) {
                temp[r++] = Valores[i++];
            } else {
                temp[r++] = Valores[q++];
                trocas++;
            }
        }

        while (i <= meio) {
            temp[r++] = Valores[i++];
        }

        while (q <= fim) {
            temp[r++] = Valores[q++];
        }

        for (i = inicio; i <= fim; i++) {
            Valores[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] ordenados = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
            26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        
        mergeSort(ordenados);
        
        int[] inversos = {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25,
            24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        mergeSort(inversos);
        
        int[] aleatorios = {11, 39, 6, 24, 18, 4, 48, 10, 29, 27, 36, 50, 22, 14, 45, 25, 8, 2, 21, 46, 33, 12, 41, 1, 17, 35, 5,
            38, 43, 40, 26, 47, 16, 31, 30, 9, 20, 42, 7, 37, 34, 23, 32, 13, 19, 49, 44, 15, 3, 28};
        
        mergeSort(aleatorios);
    }
}

