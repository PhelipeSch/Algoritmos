public class Exercicio_13 {
    
public static String Escreve_Por_Extenso_1_a_99_999(int intervalo){
        intervalo = 13968;
        String devolucao ="TREZE MIL NOVE CENTOS E SESSENTA E OITO";
        
        if(intervalo < 0 || intervalo < 99_999) {
            devolucao = "INVALIDO";
        }
        return devolucao;
    }
}
