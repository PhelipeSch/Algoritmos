public class Exercicio_10 {
    public static String Escreve_Por_Extenso(int valor){
        String devolucao;
        switch(valor){
            case 1: devolucao = "UM";
            break;
            case 2: devolucao = "DOIS";
            break;
            case 3: devolucao = "TRES";
            break;
            case 4: devolucao = "QUATRO";
            break;
            case 5: devolucao = "CINCO";
            break;
            case 6: devolucao = "SEIS";
            break;
            case 7: devolucao = "SETE";
            break;
            case 8: devolucao = "OITO";
            break;
            case 9: devolucao = "NOVE";
            break;
            case 10: devolucao = "DEZ";
            break;
            case 11: devolucao = "ONZE";
            break;
            case 12: devolucao = "DOZE";
            break;
            case 13: devolucao = "TREZE";
            break;
            case 14: devolucao = "QUATORZE";
            break;
            case 15: devolucao = "QUINZE";
            break;
            case 16: devolucao = "DEZESSEIS";
            break;
            case 17: devolucao = "DEZESSETE";
            break;
            case 18: devolucao = "DEZOITO";
            break;
            case 19: devolucao = "DEZENOVE";
            break;
            case 20: devolucao = "VINTE";
            break;
            default: devolucao = "Invalido";
            break; 
        }
        return devolucao;
    }
}
/*
Escreva um método que receba como parâmetro um número inteiro.
no intervalo de 1 a 20.
retorne uma String correspondente ao número por extenso. 
Caso o número seja menor que 1 ou maior que 20, o método deve retornar o texto “inválido”.
*/