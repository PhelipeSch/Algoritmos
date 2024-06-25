import java.util.Scanner;
public class SwitchCase_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Ola! digite um numero para o que voce deseja fazer sendo:");
        System.out.println("[1] para fazer Chek-in");
        System.out.println("[2] para chamar servico de quarto");
        System.out.println("[3] para fazer pedido");
        int desejo = leitor. nextInt();
        
        switch(desejo){
            case 1:
                System.out.println("Para fazer Chek-in va para a recepcao");
            break;
            
            case 2:
                System.out.println("Ligue para o numero (99)99999-9999");
            break;
            
            case 3:
                System.out.println("Chame um recepcionista");
            break;
            
            default:
                System.out.println("Nao entendi o que voce digitou");
            break;
        }
    }
    
}
