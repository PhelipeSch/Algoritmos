import java.util.Scanner;
public class If_Else_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double pri = leitor.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double seg = leitor.nextDouble();
        
        if(pri > seg){
            System.out.println("O primeiro numero eh o maior valor: " + pri);
        }else{
            System.out.println("O segundo numero eh o maior: " + seg);
        }
    }
    
}
