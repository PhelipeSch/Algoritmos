import java.util.Scanner;
public class If_Else_8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = leitor.nextDouble();
        
        double maior, menor;
        
        if(valor1 > valor2 && valor1 > valor3){
            System.out.println("Maior valor: " + valor1);
            maior = valor1;
        }else{
            if(valor2 > valor3){
                System.out.println("Maior valor: " + valor2);
                maior = valor2;
            }else{
                System.out.println("Maior valor: " + valor3);
                maior = valor3;
            }
        }
        
        if(valor1 < valor2 && valor1 < valor3){
            System.out.println("Menor valor: " + valor1);
            menor = valor1;
        }else{
            if(valor2 < valor3){
                System.out.println("Menor valor: " + valor2);
                menor = valor2;
            }else{
                System.out.println("Menor valor: " + valor3);
                menor = valor3; 
            }
        }
        
        if( valor1 > menor && valor1 < maior ){
            System.out.println("Valor intermediário: " + valor1);
        }
        if( valor2 > menor && valor2 < maior ){
            System.out.println("Valor intermediário: " + valor2);
        }
        if( valor3 > menor && valor3 < maior ){
            System.out.println("Valor intermediario: " + valor3);
        }
    }
}
