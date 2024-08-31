import java.util.Scanner;
public class Torre_De_Hanoi {
    
    public static void Movimentos_na_Torre (int discos, String origem, String destino, String apoio){
        
        if(discos == 1){
            System.out.println("Mova o disco mais superficial de "+origem+" para "+destino);
            return;
        }
        
        Movimentos_na_Torre(discos-1, origem, apoio, destino);
        System.out.println("Mova o disco mais superficial de "+origem+" para "+destino);
        Movimentos_na_Torre(discos-1, apoio, destino, origem);
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o numero de discos da torre: ");
        int discos = leitor.nextInt();
        
        System.out.println("Digite um nome para o pino de origem: ");
        String origem = leitor.next();
        
        System.out.print("Digite um nome para o pino de destino: ");
        String destino = leitor.next();
        
        System.out.println("Digite um nome para o pino de apoio: ");
        String apoio = leitor.next();
      
        double minimo = Math.pow(2, discos)-1;
        
        System.out.println("");
        System.out.println("O minimo de movimentos para essa quantidade de discos eh igual a: "+ (int)minimo);
        
        System.out.println("");
        System.out.println("Vamos resolver essa torre com a origem dos discos no pino "+origem+", o pino de apoio sendo "+apoio+" e o destino final sendo o pino "+destino);
        
        System.out.println("");
        System.out.println("Os movimentos devem ser:");
        
        Movimentos_na_Torre(discos,origem,destino,apoio);
    }
}
/*
Deve ser programado um algoritmo em Java da Torre de Hanói, com um número de discos informado pelo usuário.
O programa deve informar qual o número mínimo de movimentos necessários e 
listar os movimentos necessários para resolver a Torre com o número informado.
*/