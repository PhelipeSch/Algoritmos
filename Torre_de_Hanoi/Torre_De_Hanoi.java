import java.util.Scanner;
public class Torre_De_Hanoi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o numero de discos da torre: ");
        int discos = leitor.nextInt();
        
        double minimo = Math.pow(2, discos)-1;
        System.out.println("O minimo de movimentos para essa quantidade de discos eh igual a: "+ (int)minimo);
    }
}
/*
Deve ser programado um algoritmo em Java da Torre de Hanói, com um número de discos informado pelo usuário.
O programa deve informar qual o número mínimo de movimentos necessários e 
listar os movimentos necessários para resolver a Torre com o número informado.
*/