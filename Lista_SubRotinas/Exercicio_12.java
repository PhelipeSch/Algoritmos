public class Exercicio_12 {
    
    public static String Escreve_Por_Extenso_1_a_999(int intervalo){
        intervalo = 99;
        String devolucao ="NOVENTA E NOVE";
        
        if(intervalo < 0 || intervalo < 999) {
            devolucao = "INVALIDO";
        }
        return devolucao;
    }
}
/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 999, e
retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
intervalo, o método deve retornar o texto “inválido”.
*/