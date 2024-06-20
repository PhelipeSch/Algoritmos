import java.util.Scanner;
public class Pizzaria {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Tamanhos das pizzas:");
        System.out.println("1-Pequena, 2-Media, 3-Grande, 4-Super e 5-Familia");
        
        System.out.println("Digite o tamanho que voce quer:");
        int tam = leitor.nextInt();
        
        switch (tam) {
            case 1 :
            case 2 :
                System.out.println("E possivel escolher um sabor");    
            break;
            
            case 3 :
                System.out.println("E possivel escolher três sabores");  
            break;
            
            case 4 :
                System.out.println("E possivel escolher quatro sabores");  
            break;
            
            case 5 :
                System.out.println("E possivel escolher cinco sabores");  
            break;
            
            default :
                System.out.println("Nao consegui entender o que voce digitou!");
                System.out.println("Por favor reeinicie o programa e digite um numero entre 1 e 5.");
        }
        
    }
    
}
