import java.util.Scanner;
public class If_Else_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite um valor: ");
        double valor = leitor.nextDouble ();
        
        if(valor > 0){
            System.out.println("O valor digitado foi positivo: " + valor);
        }else{
            if(valor < 0){
                System.out.println("O valor digitado eh negativo: " + valor);
            }else{
                System.out.println("O valor digitado eh 0");
            }
        }
    }
}
