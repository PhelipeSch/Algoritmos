import java.util.Scanner;
public class Taylor_Switch {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Escolha um salgado");
        System.out.println("[1]-Coxinha R$5,50");
        System.out.println("[2]-Risoles R$6,00");
        System.out.println("[3]-Pao de queijo R$5,00");
        double salgado = leitor.nextDouble();
        
        System.out.println("Escolha uma bebida");
        System.out.println("[1]-Agua R$3,00");
        System.out.println("[2]-Suco R$3,50");
        System.out.println("[3]-Cha R$4,50");
        double bebida = leitor.nextDouble();
        
        double soma =(salgado + bebida);
 
        }
        
    }
    

