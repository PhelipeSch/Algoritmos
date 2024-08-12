public class Exercicio_15 {
    public static double Soma_de_Um_Vetor_Real (double vetor[]){
        double soma = 0;
        
        for( int i=0; i<vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }
}
/*
Escreva um método recursivo que some todos os elementos de um vetor de reais que for
passado como parâmetro de entrada para o método.
*/