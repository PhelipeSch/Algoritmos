import java.util.Scanner;
public class If_Else_5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota do aluno: ");
        double Nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        double Nota2 = leitor.nextDouble();
         
        double media = (Nota1 + Nota2)/2;
        
        if(media >= 7){
            if(media == 10){
                System.out.println("Aprovado com Distincao");
            }else{
            System.out.println("Aprovado");
            }
        }else{
            System.out.println("Reprovado");
        }
    }
}
