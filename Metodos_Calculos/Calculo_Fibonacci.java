public class Calculo_Fibonacci {
    public static int calcularFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int numAntigo = 1, numAtual = 1;
        for (int i = 3; i <= n; i++) {
            int novoNum = numAntigo + numAtual;
            numAntigo = numAtual;
            numAtual = novoNum;
        }
        return numAtual;
    }
}  