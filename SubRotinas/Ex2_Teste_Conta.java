public class Ex2_Teste_Conta {
    public static void main(String[] args) {
        Ex1_Conta minhaConta = new Ex1_Conta();
        
        System.out.println(minhaConta.getSaldo() );
        System.out.println(minhaConta.saque(50.0) );
        System.out.println(minhaConta.deposito(-50.0) );
        System.out.println(minhaConta.deposito(50.0) );
        System.out.println("Saldo: " + minhaConta.getSaldo() );
        
        System.out.println(minhaConta.saque(34.0) );
        System.out.println("Saldo: " + minhaConta.getSaldo() );
    }
}
