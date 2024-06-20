import java.util.Scanner;
public class Academico {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        
        System.out.print("Aulas dadas:");
        int numAulas = leitor.nextInt();
         
        System.out.print("Numero de faltas:");
        int numFaltas = leitor.nextInt();
       
         System.out.print("Media do semestre:");
        double media = leitor.nextDouble();
        
        double frequencia = (numAulas - numFaltas) / (double) numAulas;
        // transformamos em double para poder multiplicar pois se não daria 0 resto 90 mas como tem o double ficou 100.0
        //que ai sim conseguimos dividir e deu 0,9
     
        if(  frequencia >= 0.75 ) { 
            if( media >= 7.0){
                System.out.println("Aprovado!!!!!!!!!!!!!!");
            } else {
                if (media < 1.8) {
                    System.out.println("Reprovado por nota!!!!!!!!!");
                } else {
                    System.out.println("Em exame");
                }
                
            }
        } else
                System.out.println("Reprovado por faltas!!!!!!");
    }
        
}

