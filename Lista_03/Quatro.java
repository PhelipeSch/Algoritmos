import java.util.Scanner;
public class Quatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
       
        int numero = leitor.nextInt();
        
        
        if( numero> 2){
            int divisor = 2;
            int resto = numero % 2;
            while(resto!=0  && divisor <numero-1){
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
