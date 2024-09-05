public class Exercicio_07 {
    static final int TAMANHO = 10_000_000;
    static int[] vetor = new int [TAMANHO];
    
    public static void main(String[] args) {
        
        for(int i=0; i<vetor.length; i++){
            vetor[i] = (int) Math.rint(Math.random() *1_000_000);
        }
        // Busca Linear
        //Nesse teste, vamos grerar numeros aleatorios e pesquisar no vetor
        //Serão realizadas 100 buscas, medido o tempo de cada uma e a quantidade
        // de comparacoes realizadas
        
        for(int i =0; i< 100; i++){
            int comp;
            int numero = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio = System.currentTimeMillis();
            for(comp = 0; comp <vetor.length && numero != vetor[comp]; comp++){
            }
            long fim = System.currentTimeMillis();
            System.out.println("Comparacoes: "+ comp +" e o tempo foi de "+(fim-inicio)+" ms");
        }
    }
}