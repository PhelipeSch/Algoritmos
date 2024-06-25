import java.util.Scanner;
public class SwitchCase_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Escolha dois produtos:");
        System.out.println("Detergente   codigo:100   Valor R$1,59");
        System.out.println("Esponja   codigo:101   Valor R$4,59");
        System.out.println("La de aco   codigo:102   Valor R$1,79");
        
        System.out.print("Digite o codigo do produto 1: ");
        int produto1 = leitor.nextInt();
        
        System.out.print("Digite o codigo do produto 2: ");
        int produto2 = leitor.nextInt();
        
        int soma = produto1+produto2;
        
        switch(soma){
            
            case 201: 
                System.out.println("A soma do Detergente e da Esponja deu R$6,18");
            break;
            
            case 202:
                System.out.println("A soma do Detergente com a La de aco deu R$3,38");
            break;
            
            case 203:
                System.out.println("A soma da Esponja com a La de aco deu R$6,38");
            break;
            
            default:
                System.out.println("Nao entendi o que voce digitou!");
            break;
        }
    }
    
}
