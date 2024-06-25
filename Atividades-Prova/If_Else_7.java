import java.util.Scanner;
public class If_Else_7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = leitor.nextDouble();
        
        if(valor1 > valor2 && valor1 > valor3){
            System.out.println("O pimeiro valor eh o maior: " + valor1);
        }else{
            if(valor2 > valor3){
                System.out.println("O segundo valor eh o maior: " + valor2);
            }else{
                System.out.println("O terceiro valor eh o maior: " + valor3);
            }
        }
        
        if(valor1 < valor2 && valor1 < valor3){
            System.out.println("O pimeiro valor eh o menor: " + valor1);
        }else{
            if(valor2 < valor3){
                System.out.println("O segundo valor eh o menor: " + valor2);
            }else{
                System.out.println("O terceiro valor eh o menor: " + valor3);
            }
        }
    }
    
}
