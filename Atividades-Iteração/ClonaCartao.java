import java.util.Scanner;
public class ClonaCartao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //complementares numero== 0 é numero 1=0
        // complementares numero < 0 é numero >=0
        //complemetares numero > 0 é numero <= 0
        
        int numero = leitor.nextInt();
       
        if( numero == 0) {
            System.out.println("O numero eh ZERO");
        } else {
            if (numero <0) {
             System.out.println("o numero e NEGATIVO");
            } else {
                System.out.println("O numero e POSITIVO");
                //sout escreve automaticamente o System.out.println("")
                
            }
        }
    }
}
