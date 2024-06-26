import java.util.Scanner;
public class Quatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
       
        System.out.print("Digite um numero que deseja descobrir se eh primo: ");
        int numero = leitor.nextInt();
        
        if( numero> 2){
            int divisor = 2;
            int resto = numero % 2;
            
            while(resto!=0  && divisor <numero/2){
                divisor++;
                resto = numero%divisor;
            }
            
            if(resto== 0 ){
            System.out.println("O numero nao eh primo");
            }else{
                System.out.println("O numero eh primo");
            }
        }
    }
}
