import java.util.Scanner;
public class Elif {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
       
        System.out.print("Numero de aulas dadas:");
        int AulasDadas = leitor.nextInt();
       
        System.out.print("Numero de Faltas do estudante:");
        int Faltas = leitor.nextInt();
        
        double presenca = (AulasDadas - Faltas)/(double)AulasDadas ;
       
        if (presenca < 0.75){
            System.out.println("Reprovado por falta!");
     
        } else {
            System.out.print("Digite a primeira nota do semestre:");
            double nota01 = leitor.nextDouble();
           
            System.out.print("Digite a segunda nota do semestre:");
            double nota02 = leitor.nextDouble();
            
            System.out.print("Digite a terceira nota do semestre:");
            double nota03 = leitor.nextDouble();
            
            double soma = (nota01 + nota02 + nota03);
            double media = (soma / 3);
            
            if (media >= 7.0) {
                System.out.println("Aprovado!");
                System.out.println(media);
            }else {
            
             if ( media < 1.8){
                System.out.println("Reprovado por Nota!");
                 System.out.println(media);
                
            } else {
                System.out.println("Em Exame!");
                 System.out.println(media);
             }
                
            }
            
        }
        
    }
    
}