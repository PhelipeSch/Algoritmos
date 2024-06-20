import java.util.Scanner;
public class CondicionaisAninhadas {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        System.out.print("Digite a media:");
        double media = leitor.nextDouble();
        if( media >= 7 ) { 
            System.out.println("Aprovado!!!!!!!!!!");
        } else {
            if ( media < 1.8 ) {
                System.out.println("Reprovado!!!!!");
            } else {
                System.out.println("Em Exame!!!!!!");
            
        }
           }
        }
    }
