import java.util.Scanner;
public class SwitchCase_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um numero de 1 a 7 para o dia da semana sendo 1 domingo e 7 sabado: ");
        int dia = leitor.nextInt();
        
        switch(dia){
            case 1,7:
                System.out.println("Fim de semana");
            break;
            
            case 2,3,4,5,6:
                System.out.println("Dia util");
            break;
            
            default:
                System.out.println("Nao entendi o que voce digitou!");
            break;
        }
    }
    
}
