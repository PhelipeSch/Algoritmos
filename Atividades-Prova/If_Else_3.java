import java.util.Scanner;
public class If_Else_3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        
        System.out.println("Digite [F] para feminino e [M] para masculino: ");
        String gen = leitor.nextLine();
        String Fem = "F";
        String Mas = "M";
        
        if(gen.equalsIgnoreCase(Mas)){
            System.out.println("O genero digitado eh Masculino");
        }else{
            if(gen.equalsIgnoreCase(Fem)){
                System.out.println("O genero digitado eh Feminino");
            }else{
                System.out.println("Nao endenti o que voce digitou!");
        }
        }
    }
    
}
