import java.util.Scanner;
public class SwitchCase_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite o codigo de uma operacao matematica a seguir e apos seus valores:");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtracao");
        System.out.println("[3] Divisao");
        System.out.println("[4] Multiplicacao");
        int oper = leitor.nextInt();
        
        System.out.print("Digite o primeiro operando:");
        double numero1 = leitor.nextDouble();
        
        System.out.print("Digite o segundo operando: ");
        double numero2 = leitor.nextDouble();
        
        switch(oper){
            
            case 1:
                double soma = numero1 + numero2;
                System.out.println("O resultado da soma eh: " + soma);
            break;
            
            case 2:
                double sub = numero1 - numero2;
                System.out.println("O resultado da subtracao eh: " + sub);
            break;
            
            case 3:
                double div = numero1 / numero2;
                System.out.println("O resultado da divisao eh: " + div);
            break;
            
            case 4:
                double mult = numero1 * numero2;
                System.out.println("O resultado da multiplicacao eh: " + mult);
            break;
           
            default:
                System.out.println("Nao entendi o que voce digitou!!");
            break;
        }
    }
    
}
