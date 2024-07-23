
public class Ex1_Conta {

    //ATRIBBUTOS
    private double saldo;

    //METODO: saque
    //Parametro/Argumento: valor (informacao de entrada para o metodo)
    //Retorno(tipo): boolean (informacao de saida do metodo)
    public boolean saque(double valor) {

        boolean resultado = (valor > 0) && (valor <= saldo);

        if (resultado) {
            saldo = saldo - valor;
        }

        return resultado;
    }

    //METODO: deposito
    //Parametro/Argumento: valor
    //Retorno (tipo) : boolean
    public boolean deposito(double valor) {
        boolean resultado = (valor > 0);
        if (resultado) {
            saldo = saldo + valor;
        }
        return resultado;
        
    }
    
    // METODO: getSaldo
    // Parametro/Argumento: não possui
    // Retorno (tipo): double
    public double getSaldo(){
        return this.saldo;
    }
}
